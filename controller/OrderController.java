package controller;

import model.Order;
import model.Orderline;
import model.OrderContainer;
import model.Product;
import model.Customer;

/**
 * Controller for UC01: Create Order.
 *
 * Handles the full order creation flow:
 * 1. A new Order is created with createOrder().
 * 2. The customer is found by ID with findCustomer() and linked to the order.
 * 3. Products are searched by name with findProduct() and added with addProduct().
 * 4. The order is saved and its ID returned with confirmOrder().
 *
 * Uses CustomerController for customer lookup and ProductController for product lookup,
 * so each controller stays focused on its own responsibility (GRASP: Low Coupling).
 *
 * @author MA
 * @version 1.0
 */
public class OrderController {

    private Order currentOrder;
    private Customer currentCustomer;
    private Orderline currentOrderline;
    private CustomerController customerController;
    private ProductController productController;
    private OrderContainer orderContainer;

    /**
     * Creates OrderController with required sub-controllers and container.
     */
    public OrderController() {
        customerController = new CustomerController();
        productController = new ProductController();
        orderContainer = new OrderContainer();
    }

    /**
     * Initialises a new empty order.
     */
    public void createOrder() {
        currentOrder = new Order();
    }

    /**
     * Finds a customer by ID and links them to the current order.
     * @param customerId the customer's ID
     */
    public void findCustomer(int customerId) {
        currentCustomer = customerController.findCustomer(customerId);
        if (currentCustomer != null) {
            currentOrder.setCustomer(currentCustomer);
            System.out.println("Kunde fundet: " + currentCustomer.getName());
        } else {
            System.out.println("Ingen kunde med ID " + customerId + ".");
        }
    }

    /**
     * Finds a product by name.
     * @param productName name or partial name to search
     * @return the found Product, or null if not found
     */
    public Product findProduct(String productName) {
        return productController.findProduct(productName);
    }

    /**
     * Creates an orderline and adds it to the current order.
     * @param foundProduct the product to add
     * @param qty          quantity to order
     */
    public void addProduct(Product foundProduct, int qty) {
        currentOrderline = new Orderline(foundProduct, qty);
        currentOrder.addOrderline(currentOrderline);
    }

    /**
     * Saves the current order.
     */
    public void confirmOrder() {
        orderContainer.saveOrder(currentOrder);
    }

    /**
     * Returns the current order's ID.
     * @return orderId
     */
    public int getCurrentOrderId() {
        return currentOrder.getOrderId();
    }
}

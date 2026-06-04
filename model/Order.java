package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sales order in the Vestbjerg Byggecenter system.
 *
 * An Order is created when a customer wants to buy products (UC01).
 * It holds the date it was created, a status, the customer who placed it,
 * and a list of orderlines — one for each product added to the order.
 * Each Order gets a unique ID automatically when it is created.
 *
 * @author SK
 * @version 1.0
 */
public class Order {

    private static int nextId = 1;

    private int orderId;
    private LocalDate orderDate;
    private String status;
    private Customer customer;
    private List<Orderline> orderlines;

    /**
     * Creates a new Order with today's date and status "oprettet".
     */
    public Order() {
        this.orderId = nextId++;
        this.orderDate = LocalDate.now();
        this.status = "oprettet";
        this.orderlines = new ArrayList<>();
    }

    /**
     * Links a customer to this order.
     * @param customer the customer placing the order
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Adds an orderline to this order.
     * @param orderline the orderline to add
     */
    public void addOrderline(Orderline orderline) {
        orderlines.add(orderline);
    }

    /**
     * Returns this order's ID.
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Returns the customer linked to this order.
     * @return customer, or null if not yet set
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Returns the date the order was created.
     * @return orderDate
     */
    public java.time.LocalDate getOrderDate() {
        return orderDate;
    }

    /**
     * Returns the current order status, e.g. "oprettet".
     * @return status
     */
    public String getStatus() {
        return status;
    }
}

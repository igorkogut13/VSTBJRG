package model;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory storage for all Order objects in the system.
 *
 * The list is static, meaning all instances of OrderContainer share the same data.
 * This ensures that orders saved by one controller are visible to all other controllers
 * without needing a database.
 * Orders are added when confirmed (UC01) and can be retrieved for overview purposes.
 *
 * @author EP
 * @version 1.0
 */
public class OrderContainer {

    private static List<Order> orders = new ArrayList<>();

    /**
     * Creates an OrderContainer.
     */
    public OrderContainer() {
    }

    /**
     * Saves an order.
     * @param order the order to save
     */
    public void saveOrder(Order order) {
        orders.add(order);
    }

    /**
     * Returns all saved orders.
     * @return list of all orders
     */
    public List<Order> findAll() {
        return orders;
    }
}

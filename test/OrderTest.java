package test;

import model.Customer;
import model.Order;
import model.Orderline;
import model.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Order domain class.
 *
 * @author MA
 * @version 1.0
 */
public class OrderTest {

    private Order order;

    /**
     * Creates a fresh Order before each test.
     */
    @Before
    public void setUp() {
        order = new Order();
    }

    /**
     * New order gets a positive ID.
     */
    @Test
    public void testOrderIdIsPositive() {
        assertTrue(order.getOrderId() > 0);
    }

    /**
     * New order has status "oprettet".
     */
    @Test
    public void testInitialStatusIsOprettet() {
        assertEquals("oprettet", order.getStatus());
    }

    /**
     * New order has a date (not null).
     */
    @Test
    public void testOrderDateIsSet() {
        assertNotNull(order.getOrderDate());
    }

    /**
     * Two orders get different IDs.
     */
    @Test
    public void testTwoOrdersHaveDifferentIds() {
        Order other = new Order();
        assertNotEquals(order.getOrderId(), other.getOrderId());
    }

    /**
     * setCustomer links the customer to the order.
     */
    @Test
    public void testSetCustomer() {
        Customer c = new Customer("Test", "11111111", "t@t.dk", "Vej 1", "privat");
        order.setCustomer(c);
        assertEquals(c, order.getCustomer());
    }

    /**
     * addOrderline adds an orderline without error.
     */
    @Test
    public void testAddOrderline() {
        Product p = new Product(1, "Mursten", 2.50, 4.95, 100, 5000, 200);
        Orderline line = new Orderline(p, 10);
        order.addOrderline(line);
    }
}

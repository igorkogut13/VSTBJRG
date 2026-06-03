package test;

import controller.OrderController;
import model.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for OrderController (UC01: Create Order).
 *
 * @author
 * @version
 */
public class OrderControllerTest {

    private OrderController oc;

    /**
     * Creates a fresh OrderController before each test.
     */
    @Before
    public void setUp() {
        oc = new OrderController();
        oc.createOrder();
    }

    /**
     * findProduct returns correct product when name matches.
     */
    @Test
    public void testFindProductFound() {
        Product result = oc.findProduct("Mursten");
        assertNotNull(result);
        assertEquals("Mursten", result.getName());
    }

    /**
     * findProduct returns null when name has no match.
     */
    @Test
    public void testFindProductNotFound() {
        Product result = oc.findProduct("FindesIkke");
        assertNull(result);
    }

    /**
     * findProduct supports partial name match.
     */
    @Test
    public void testFindProductPartialName() {
        Product result = oc.findProduct("cement");
        assertNotNull(result);
    }

    /**
     * confirmOrder followed by getCurrentOrderId returns a positive order ID.
     */
    @Test
    public void testConfirmOrderGivesPositiveId() {
        oc.findCustomer(1);
        Product p = oc.findProduct("Mursten");
        assertNotNull(p);
        oc.addProduct(p, 10);
        oc.confirmOrder();
        int id = oc.getCurrentOrderId();
        assertTrue(id > 0);
    }

    /**
     * Two separate orders get different IDs.
     */
    @Test
    public void testTwoOrdersGetDifferentIds() {
        oc.findCustomer(1);
        Product p = oc.findProduct("Mursten");
        oc.addProduct(p, 5);
        oc.confirmOrder();
        int id1 = oc.getCurrentOrderId();

        oc.createOrder();
        oc.findCustomer(1);
        oc.addProduct(p, 3);
        oc.confirmOrder();
        int id2 = oc.getCurrentOrderId();

        assertNotEquals(id1, id2);
    }
}

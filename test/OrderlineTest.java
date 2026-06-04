package test;

import model.Orderline;
import model.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Orderline domain class.
 *
 * @author SK
 * @version 1.0
 */
public class OrderlineTest {

    private Product product;
    private Orderline orderline;

    /**
     * Creates a test product and orderline before each test.
     */
    @Before
    public void setUp() {
        product = new Product(1, "Mursten", 2.50, 4.95, 100, 5000, 200);
        orderline = new Orderline(product, 50);
    }

    /**
     * getQuantity returns the quantity given at construction.
     */
    @Test
    public void testGetQuantity() {
        assertEquals(50, orderline.getQuantity());
    }

    /**
     * getProduct returns the product given at construction.
     */
    @Test
    public void testGetProduct() {
        assertEquals(product, orderline.getProduct());
    }

    /**
     * Product name accessible through orderline.
     */
    @Test
    public void testProductNameThroughOrderline() {
        assertEquals("Mursten", orderline.getProduct().getName());
    }
}

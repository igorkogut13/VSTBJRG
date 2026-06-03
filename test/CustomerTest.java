package test;

import model.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Customer domain class.
 *
 * @author
 * @version
 */
public class CustomerTest {

    private Customer customer;

    /**
     * Creates a test customer before each test.
     */
    @Before
    public void setUp() {
        customer = new Customer("Test Person", "+45 11111111", "test@test.dk", "Testvej 1, 9000 Aalborg", "privat");
    }

    /**
     * Customer gets a positive ID on creation.
     */
    @Test
    public void testCustomerIdIsPositive() {
        assertTrue(customer.getCustomerId() > 0);
    }

    /**
     * getName returns the name given at construction.
     */
    @Test
    public void testGetName() {
        assertEquals("Test Person", customer.getName());
    }

    /**
     * getPhone returns the phone given at construction.
     */
    @Test
    public void testGetPhone() {
        assertEquals("+45 11111111", customer.getPhone());
    }

    /**
     * getEmail returns the email given at construction.
     */
    @Test
    public void testGetEmail() {
        assertEquals("test@test.dk", customer.getEmail());
    }

    /**
     * getType returns the type given at construction.
     */
    @Test
    public void testGetType() {
        assertEquals("privat", customer.getType());
    }

    /**
     * Two customers get different IDs.
     */
    @Test
    public void testTwoCustomersHaveDifferentIds() {
        Customer other = new Customer("Anden", "22222222", "a@a.dk", "Vej 2", "erhverv");
        assertNotEquals(customer.getCustomerId(), other.getCustomerId());
    }
}

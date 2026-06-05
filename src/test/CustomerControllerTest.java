package test;

import controller.CustomerController;
import model.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for CustomerController (UC02: Create Customer).
 *
 * @author
 * @version
 */
public class CustomerControllerTest {

    private CustomerController cc;

    /**
     * Creates a fresh CustomerController before each test.
     */
    @Before
    public void setUp() {
        cc = new CustomerController();
    }

    /**
     * Seeded customer with ID 1 can be found.
     */
    @Test
    public void testFindSeededCustomer() {
        Customer result = cc.findCustomer(1);
        assertNotNull(result);
        assertEquals("Lars Jensen", result.getName());
    }

    /**
     * findCustomer returns null for unknown ID.
     */
    @Test
    public void testFindCustomerNotFound() {
        Customer result = cc.findCustomer(9999);
        assertNull(result);
    }

    /**
     * Creating and confirming a customer returns a positive ID.
     */
    @Test
    public void testConfirmCustomerReturnsId() {
        cc.createCustomer();
        cc.enterCustomerInfo("Test Person", "+45 11111111", "test@test.dk", "Testvej 1, 9000 Aalborg", "privat");
        int id = cc.confirmCustomer();
        assertTrue(id > 0);
    }

    /**
     * Customer can be found by ID after being saved.
     */
    @Test
    public void testCreatedCustomerCanBeFound() {
        cc.createCustomer();
        cc.enterCustomerInfo("Ny Kunde", "+45 22222222", "ny@test.dk", "Testvej 2, 9000 Aalborg", "erhverv");
        int id = cc.confirmCustomer();

        Customer result = cc.findCustomer(id);
        assertNotNull(result);
        assertEquals("Ny Kunde", result.getName());
    }

    /**
     * Customer type is stored correctly.
     */
    @Test
    public void testCustomerTypeStored() {
        cc.createCustomer();
        cc.enterCustomerInfo("Firma Test", "+45 33333333", "firma@test.dk", "Erhvervsvej 1, 9220 Aalborg Øst", "erhverv");
        int id = cc.confirmCustomer();

        Customer result = cc.findCustomer(id);
        assertNotNull(result);
        assertEquals("erhverv", result.getType());
    }
}

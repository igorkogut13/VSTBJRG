package controller;

import model.Customer;
import model.CustomerContainer;

/**
 * Controller for customer operations.
 * Handles UC1 (find customer) and UC2 (create customer).
 *
 * @author:SCSK
 * @version
 */
public class CustomerController {

    private Customer newCustomer;
    private CustomerContainer customerContainer;

    /**
     * Creates CustomerController with a CustomerContainer.
     */
    public CustomerController() {
        customerContainer = new CustomerContainer();
    }

    /**
     * Prepares the controller to receive new customer data (UC2).
     */
    public void createCustomer() {
        newCustomer = null;
    }

    /**
     * Stores customer information before confirmation (UC2).
     * @param name    customer's full name
     * @param phone   phone number
     * @param email   email address
     * @param address postal address
     * @param type    customer type ("privat" or "erhverv")
     */
    public void enterCustomerInfo(String name, String phone, String email,
                                   String address, String type) {
        newCustomer = new Customer(name, phone, email, address, type);
    }

    /**
     * Saves the new customer and returns their ID (UC2).
     * @return the new customer's ID
     */
    public int confirmCustomer() {
        return customerContainer.save(newCustomer);
    }

    /**
     * Finds an existing customer by ID (UC1).
     * @param customerId the customer's ID
     * @return the Customer object, or null if not found
     */
    public Customer findCustomer(int customerId) {
        return customerContainer.findCustomer(customerId);
    }
}

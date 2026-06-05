package model;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory storage for Customer objects.
 * Static list ensures all controller instances share the same data.
 *
 * @author:IK
 * @version
 */
public class CustomerContainer {

    private static List<Customer> customers = new ArrayList<>();
    private static boolean initialized = false;

    /**
     * Creates CustomerContainer. Seeds sample data on first use.
     */
    public CustomerContainer() {
        if (!initialized) {
            customers.add(new Customer("Lars Jensen", "12345678", "lars@example.dk",
                    "Nørregade 1, 9000 Aalborg", "privat"));
            customers.add(new Customer("Mette Nielsen", "87654321", "mette@firma.dk",
                    "Industrivej 5, 9220 Aalborg Øst", "erhverv"));
            initialized = true;
        }
    }

    /**
     * Saves a customer and returns their ID.
     * @param customer the customer to save
     * @return the customer's generated ID
     */
    public int save(Customer customer) {
        customers.add(customer);
        return customer.getCustomerId();
    }

    /**
     * Finds a customer by ID.
     * @param customerId the ID to look up
     * @return the matching Customer, or null if not found
     */
    public Customer findCustomer(int customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                return c;
            }
        }
        return null;
    }

    /**
     * Returns all customers.
     * @return list of all customers
     */
    public List<Customer> findAll() {
        return customers;
    }
}

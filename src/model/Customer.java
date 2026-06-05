package model;

/**
 * Represents a customer registered in the Vestbjerg Byggecenter system.
 *
 * Customers are created via UC02 (Opret Kunde) and looked up in UC01 (Opret Ordre).
 * There are two types: "privat" (private individuals) and "erhverv" (business customers
 * such as craftsmen and construction companies).
 * Each Customer gets a unique ID automatically when it is created.
 *
 * @author:EG
 * @version: 
 */
public class Customer {

    private static int nextId = 1;

    private int customerId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String type;

    /**
     * Creates a new Customer with auto-generated ID.
     * @param name    full name
     * @param phone   phone number
     * @param email   email address
     * @param address postal address
     * @param type    customer type ("privat" or "erhverv")
     */
    public Customer(String name, String phone, String email, String address, String type) {
        this.customerId = nextId++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.type = type;
    }

    /**
     * Returns the customer's ID.
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Returns the customer's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the customer's phone number.
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the customer's email address.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the customer's postal address.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the customer type: "privat" or "erhverv".
     * @return type
     */
    public String getType() {
        return type;
    }
}

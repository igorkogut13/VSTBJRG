package model;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory storage for Product objects.
 * Static list ensures all controller instances share the same catalogue.
 *
 * @author IK
 * @version 1.0
 */
public class ProductContainer {

    private static List<Product> products = new ArrayList<>();
    private static boolean initialized = false;

    /**
     * Creates ProductContainer. Seeds sample products on first use.
     */
    public ProductContainer() {
        if (!initialized) {
            products.add(new Product(1, "Mursten", 2.50, 4.95, 100, 5000, 200));
            products.add(new Product(2, "Cement 25kg", 45.00, 89.00, 20, 200, 40));
            products.add(new Product(3, "Træskrue 4x40 200stk", 18.00, 35.00, 50, 500, 100));
            products.add(new Product(4, "Gipsplade 120x240cm", 55.00, 110.00, 10, 100, 20));
            products.add(new Product(5, "Isolering Rockwool 100mm", 120.00, 249.00, 5, 50, 10));
            initialized = true;
        }
    }

    /**
     * Finds a product by name (case-insensitive partial match).
     * @param productName search term
     * @return first matching Product, or null if not found
     */
    public Product findProduct(String productName) {
        String search = productName.toLowerCase();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(search)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Finds a product by ID.
     * @param productId the ID to look up
     * @return the matching Product, or null if not found
     */
    public Product findProductById(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }
}

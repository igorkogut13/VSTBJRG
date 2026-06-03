package controller;

import model.Product;
import model.ProductContainer;

/**
 * Controller responsible for product search operations.
 *
 * Acts as a facade between other controllers (e.g. OrderController) and
 * the ProductContainer. Used in UC01 when the employee searches for a product
 * by name before adding it to an order.
 *
 * @author:SCSK/IK
 * @version
 */
public class ProductController {

    private ProductContainer productContainer;

    /**
     * Creates ProductController with a ProductContainer.
     */
    public ProductController() {
        productContainer = new ProductContainer();
    }

    /**
     * Finds a product by name.
     * @param productName name or partial name to search for
     * @return the matching Product, or null if not found
     */
    public Product findProduct(String productName) {
        return productContainer.findProduct(productName);
    }
}

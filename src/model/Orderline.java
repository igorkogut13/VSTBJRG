package model;

/**
 * Represents a single line in a sales order.
 *
 * Each Orderline connects one Product to the quantity the customer wants to buy.
 * An Order can have multiple Orderlines — one per product type.
 * For example: "10 x Mursten" and "2 x Cement 25kg" would be two separate Orderlines
 * on the same Order.
 *
 * @author:EG
 * @version
 */
public class Orderline {

    private int quantity;
    private Product product;

    /**
     * Creates an orderline for a product and quantity.
     * @param product the product being ordered
     * @param qty     quantity to order
     */
    public Orderline(Product product, int qty) {
        this.product = product;
        this.quantity = qty;
    }

    /**
     * Returns the ordered quantity.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns the product this orderline refers to.
     * @return product
     */
    public Product getProduct() {
        return product;
    }
}

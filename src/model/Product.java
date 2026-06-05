package model;

/**
 * Represents a product in Vestbjerg Byggecenter's catalogue.
 *
 * @author:MA
 * @version
 */
public class Product {

    private int productId;
    private String name;
    private double costPrice;
    private double sellingPrice;
    private int minStock;
    private int maxStock;
    private int reorderThreshold;

    /**
     * Creates a Product.
     * @param productId        unique product ID
     * @param name             product name
     * @param costPrice        purchase cost in DKK
     * @param sellingPrice     selling price to customer in DKK
     * @param minStock         minimum stock level before reorder alert
     * @param maxStock         maximum stock capacity
     * @param reorderThreshold quantity at which to reorder
     */
    public Product(int productId, String name, double costPrice, double sellingPrice,
                   int minStock, int maxStock, int reorderThreshold) {
        this.productId = productId;
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.reorderThreshold = reorderThreshold;
    }

    /**
     * Returns the product's ID.
     * @return productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Returns the product's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the selling price.
     * @return sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Returns the minimum stock level.
     * @return minStock
     */
    public int getMinStock() {
        return minStock;
    }

    /**
     * Returns the maximum stock capacity.
     * @return maxStock
     */
    public int getMaxStock() {
        return maxStock;
    }

    /**
     * Returns the reorder threshold.
     * @return reorderThreshold
     */
    public int getReorderThreshold() {
        return reorderThreshold;
    }

    /**
     * Returns the cost price (what Vestbjerg pays the supplier) in DKK.
     * @return costPrice
     */
    public double getCostPrice() {
        return costPrice;
    }
}

public class SingleProduct {
    private int productId;
    private String productName;
    private String productType;
    private double price;
    private int totalStock;

    public SingleProduct(int productId, String productName, String productType, double price, int totalStock) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.totalStock = totalStock;
    }

    public SingleProduct() {
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    @Override
    public String toString() {
        return  "The product with id " +
                productId + " is the " +
                productName + ", which is the " +
                productType + ", its price is " +
                price + " and its stock is " +
                totalStock + ".";
    }
}

public class Product {
    private String productName;
    private int unitSold;
    private float unitPrice;

    public Product(String productName, int unitSold, float unitPrice) {
        setProductName(productName);
        setUnitSold(unitSold);
        setUnitPrice(unitPrice);
    }

    public void setProductName(String productName) {
        if(productName.length() <= 10)
            this.productName = productName;
    } 

    public void setUnitSold(int unitSold) {
        if(unitSold < 0)
            this.unitSold = 0;
        else this.unitSold = unitSold;
    }
    public void setUnitPrice(float unitPrice) {
        if(unitPrice < 0)
            this.unitPrice = 0;
        else this.unitPrice = unitPrice;
    }

    public String getProductName() { return productName; }
    public int getUnitSold() { return unitSold; }
    public float getUnitPrice() { return unitPrice; }
}

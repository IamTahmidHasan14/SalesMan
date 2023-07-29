public class SalesMan {
    private String name;
    private int category;
    private float salary;
    private Product[] products;
    private int i = 0;

    private float getTotalAmountSold() {
        float sum = 0;
        for(Product product : products)
            sum += product.getUnitPrice() * product.getUnitSold();
        return sum;
    }

    public SalesMan(String name, int category, float salary, int productSold) {
        this.name = name;
        this.category = category;
        this.salary = salary;

        products = new Product[productSold];
    }

    public void addProduct(Product product) {
        // if(i == products.length) {
        //     System.out.println("can not add any more products");
        //     return;
        // }
        products[i++] = product;
    }

    public float getComission() {
        if(category == 1)
            return (30 / getTotalAmountSold()) * 100;
        return (20 / getTotalAmountSold()) * 100;
    }

    public String toString() {
        return name;
    }

}
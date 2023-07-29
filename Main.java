public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readLine());
        SalesMan[] salesMan = new SalesMan[n];

        for(int i = 0; i < salesMan.length; ++i) {
            String name = IO.readLine();
            int category = Integer.parseInt(IO.readLine());
            float salary = Float.parseFloat(IO.readLine());
            int productSold = Integer.parseInt(IO.readLine());
            salesMan[i] = new SalesMan(name, category, salary, productSold);

            for(int j = 1; j <= productSold; ++j) {
                String productName = IO.readLine();
                int unitSold = Integer.parseInt(IO.readLine());
                float unitPrice = Float.parseFloat(IO.readLine());
                Product product = new Product(productName, unitSold, unitPrice);
                salesMan[i].addProduct(product);
            }

        }

        salesMan[0].addProduct(new Product("sdasf", 231, 1.2f));

        for(SalesMan s : salesMan)
            System.out.printf("sales man %s got commission: %f\n", s, s.getComission());
    }
}
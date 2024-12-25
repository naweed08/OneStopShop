public class TillSystemTester {

    public static void main(String[] args) {
        TillSystem ts = new TillSystem();
        Product banana = new Product("Banana", 0.99, 6);

        ts.addProduct(banana);

        System.out.println(ts.displayScannedProducts());

    }


}

public class TillSystemTester {

    public static void main(String[] args) {
        TillSystem ts = new TillSystem();
        Product banana = new Product("Banana", 0.99, 6);
        Product carrot = new Product("Carrots", 1.29, 4);
        Product mango = new Product("Mango", 0.49, 12);

        ts.addProduct(banana);

        // Note each time printing the scanned products prints entire list:
        System.out.println("Added banana: " + ts.displayScannedProducts());

        ts.addProduct(carrot);

        System.out.println("Added carrot: " + ts.displayScannedProducts());

        ts.removeProduct(banana);

        System.out.println("Removed banana: " + ts.displayScannedProducts());

        ts.addProduct(mango);

        System.out.println("Added mango: " + ts.displayScannedProducts());

        System.out.println(ts.calculateTotal());

    }


}

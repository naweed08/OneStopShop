import java.time.LocalDate;

public class InventoryTester {

    public static void main(String[] args) {
        Inventory in1 = new Inventory();

        System.out.println("Test 1: Add crisps, pepsi, chocolate to inventory");
        in1.addProduct(new Product("Crisps", 0.79, 12, LocalDate.of(2025, 11, 2)));
        in1.addProduct(new Product("Pepsi", 0.79, 10, LocalDate.of(2025, 10, 20)));
        in1.addProduct(new Product("Chocolate", 0.79, 4, LocalDate.of(2025, 7, 8)));
        System.out.println(in1.viewAllProducts() + "\n");

        System.out.println("Test 2: Change crisps Expiry date");
        in1.changeDate("Crisps", LocalDate.of(2025,11,8));
        System.out.println(in1.viewAllProducts() + "\n");

        System.out.println("Test 3: get a products Expiry date");
        System.out.println(in1.getExpiryDate("Crisps") + "\n");

        System.out.println("Test 4: Remove a product");
        System.out.println(in1.removeProduct("Crisps") + "\n");
        System.out.println(in1.viewAllProducts());

    }



}

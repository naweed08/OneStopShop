import java.time.LocalDate;

public class InventoryTester {

    public static void main(String[] args) {
        Inventory in1 = new Inventory();

        System.out.println("Test 1: Add crisps to inventory");
        in1.addProduct(new Product("Crisps", 0.79, 12, LocalDate.of(2025, 11, 2)));
        System.out.println(in1.viewAllProducts());

        System.out.println("Test 2: Change crisps Expiry date");
        in1.changeDate("Crisps", LocalDate.of(2025,11,8));
        System.out.println(in1.viewAllProducts());

        System.out.println("Test 3: get a products Expiry date");
        System.out.println(in1.getExpiryDate("Crisps"));

    }



}

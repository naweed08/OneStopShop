import java.time.LocalDate;

public class InventoryTester {

    public static void main(String[] args) {
        Inventory in1 = new Inventory();

        System.out.println("Test 1: Add crisps to inventory");
        in1.addProduct(new Product("Crisps", 0.79, 12, LocalDate.of(2025, 11, 2)));
    }



}

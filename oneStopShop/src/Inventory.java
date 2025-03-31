import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList<Product> shelfProducts;
    private LocalDate sellByDate;

    public Inventory() {
        shelfProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        shelfProducts.add(product);
    }

    public void removeProduct(Product product) {
        shelfProducts.remove(product);
    }

    public boolean changeDate (String productDesc, LocalDate newDate) {
        for (Product p : shelfProducts) {
            if (p.getDescription().equals(productDesc)) {
                p.setExpiryDate(newDate);
                return true;
            }
        }
        return false;
    }

    // Get product expiry date (by search -> product Name)
    public LocalDate getExpiryDate(Product product) {
        LocalDate s = null;
        for (Product p : shelfProducts) {
            if (p.equals(product)) {
                return p.getExpiryDate();
            }
        }
        return null;
    }

    // Get inventory List with expiry date
    public String viewAllProducts() {
        if (shelfProducts.isEmpty())
            return "Inventory is empty";

        String s = "";
        for (Product p : shelfProducts) {
            s += p + "\n";
        }
        return s;
    }


}

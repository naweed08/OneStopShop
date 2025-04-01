import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList<Product> shelfProducts;

    public Inventory() {
        shelfProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        shelfProducts.add(product);
    }

    public boolean removeProduct(String productDesc) {
        for (Product p : shelfProducts) {
            if (p.getDescription().equals(productDesc)) {
                shelfProducts.remove(p);
            }
            return true;
        }
        return false;
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

    public LocalDate getExpiryDate(String prodName) {
        LocalDate s = null;
        for (Product p : shelfProducts) {
            if (p.getDescription().equals(prodName)) {
                return p.getExpiryDate();
            }
        }
        return null;
    }

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

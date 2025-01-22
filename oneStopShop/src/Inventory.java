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

    public LocalDate changeDate (LocalDate expDate) {
        this.sellByDate = expDate;
        return expDate;
    }

    public void promptDateChange() {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Enter the new expiry date (yyyy-MM-dd): ");
        String input = s.nextLine();
        LocalDate newDate = LocalDate.parse(input, format);
        changeDate(newDate);
    }






}

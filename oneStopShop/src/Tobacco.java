import java.time.LocalDate;
import java.util.ArrayList;

public class Tobacco extends Product {

    private ArrayList<Product> tobaccoList;

    public Tobacco(String description, double price, int quantity, LocalDate expiryDate) {
        super(description, price, quantity, expiryDate);
        tobaccoList = new ArrayList<>();
        initializeTobaccoList();
    }

    private void initializeTobaccoList() {
        tobaccoList.add(new Product("Marlboro", 8.99, 20, LocalDate.of(2025, 8, 1)));
        tobaccoList.add(new Product("Blue Light", 12.99, 12, LocalDate.of(2025, 8, 1)));
        tobaccoList.add(new Product("Buzz Light", 6.99, 24, LocalDate.of(2025, 8, 1)));
        tobaccoList.add(new Product("Grey Goose", 11.99, 17, LocalDate.of(2025, 8, 1)));
    }

    public String getTobaccoList () {
        String s = " ";
        for (Product tbc : tobaccoList) {
            s += tbc + "\n";
        }
        return s;
    }

    public String getTobacco(String description) {
        for (Product tbc : tobaccoList) {
            if (tbc.getDescription().equals(description)) {
                return tbc.toString();
            }
        }
        return "Does not exist";
    }


}

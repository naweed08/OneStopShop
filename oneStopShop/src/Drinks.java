import java.time.LocalDate;
import java.util.ArrayList;

public class Drinks extends Product {

    private ArrayList<Product> drinkList;

    public Drinks(String description, double price, int quantity, LocalDate expiryDate) {
        super(description, price, quantity, expiryDate);
        drinkList = new ArrayList<>();
        initializeDrinkList();
    }

    private void initializeDrinkList() {
        drinkList.add(new Product("Coca Cola", 0.79, 34, LocalDate.of(2025, 8, 1)));
        drinkList.add(new Product("Pepsi Max", 0.79, 14, LocalDate.of(2026, 8, 1)));
        drinkList.add(new Product("Lucozade", 1.29, 23, LocalDate.of(2025, 4, 16)));
        drinkList.add(new Product("Red Bull", 1.79, 18, LocalDate.of(2025, 11, 11)));
    }

    public String getDrinksList() {
        String s = " ";
        for (Product dr : drinkList) {
            s += dr + "\n";
        }
        return s;
    }

    public String getDrink(String description) {
        for (Product drink : drinkList) {
            if (drink.getDescription().equals(description)) {
                return drink.toString();
            }
        }
        return "Drink Not Found";
    }


}

import java.util.ArrayList;

public class Drinks extends Product {

    private ArrayList<Product> drinkList;

    public Drinks(String description, double price, int quantity) {
        super(description, price, quantity);
        drinkList = new ArrayList<>();
        initializeDrinkList();
    }

    private void initializeDrinkList() {
        drinkList.add(new Product("Coca Cola", 0.79, 34));
        drinkList.add(new Product("Pepsi Max", 0.79, 14));
        drinkList.add(new Product("Lucozade", 1.29, 23));
        drinkList.add(new Product("Red Bull", 1.79, 18));
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

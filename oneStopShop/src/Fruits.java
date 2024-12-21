import java.util.ArrayList;

public class Fruits extends Product {

    private ArrayList<Product> fruitList;

    public Fruits (String description, double price, int quantity) {
        super(description, price, quantity);
        this.fruitList = new ArrayList<>();
        initializeFruitList();
    }

    private void initializeFruitList() {
        fruitList.add(new Product("Banana", 0.99, 6));
        fruitList.add(new Product("Oranges", 1.29, 6));
        fruitList.add(new Product("Mango", 3.49, 6));
        fruitList.add(new Product("Kiwi", 0.89, 6));
    }

    public String getFruitList() {
        String s = " ";
        for (Product fr : fruitList) {
            s += fr + "\n";
        }
        return s;
    }

    public String getFruit(String description) {
        for (Product fruit : fruitList) {
            if (fruit.getDescription().equals(description)) {
                return fruit.toString();
            }
        }
        return "Fruit does not exist in list";
    }

}

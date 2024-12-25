import java.util.ArrayList;

public class Tobacco extends Product {

    private ArrayList<Product> tobaccoList;

    public Tobacco(String description, double price, int quantity) {
        super(description, price, quantity);
        tobaccoList = new ArrayList<>();
        initializeTobaccoList();
    }

    private void initializeTobaccoList() {
        tobaccoList.add(new Product("Marlboro", 8.99, 20));
        tobaccoList.add(new Product("Blue Light", 12.99, 12));
        tobaccoList.add(new Product("Buzz Light", 6.99, 24));
        tobaccoList.add(new Product("Grey Goose", 11.99, 17));
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

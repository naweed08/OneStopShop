import java.util.ArrayList;

public class Vegetables extends Product{

    private ArrayList<Product> vegetableList;

    public Vegetables(String description, double price, int quantity) {
        super(description, price, quantity);
        this.vegetableList = new ArrayList<>();
        initializeVegetables();
    }

    private void initializeVegetables(){
        vegetableList.add(new Product("Brocolli", 1.29, 5));
        vegetableList.add(new Product("Onion", 1.00, 5));
        vegetableList.add(new Product("Potatoes", 2.49, 5));
        vegetableList.add(new Product("carrots", 0.79, 5));
    }

    public String getVegetableList() {
        String s = " ";
        for (Product veg : vegetableList){
            s += veg + "\n";
        }
        return s;
    }

}

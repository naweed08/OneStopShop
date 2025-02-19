import java.time.LocalDate;
import java.util.ArrayList;

public class Vegetables extends Product{

    private ArrayList<Product> vegetableList;

    public Vegetables(String description, double price, int quantity, LocalDate expiryDate) {
        super(description, price, quantity, expiryDate);
        this.vegetableList = new ArrayList<>();
        initializeVegetables();
    }

    private void initializeVegetables(){
        vegetableList.add(new Product("Broccoli", 1.29, 5, LocalDate.of(2025, 8, 1)));
        vegetableList.add(new Product("Onion", 1.00, 5, LocalDate.of(2025, 8, 1)));
        vegetableList.add(new Product("Potatoes", 2.49, 5, LocalDate.of(2025, 8, 1)));
        vegetableList.add(new Product("carrots", 0.79, 5, LocalDate.of(2025, 8, 1)));
    }

    public String getVegetableList() {
        String s = " ";
        for (Product veg : vegetableList){
            s += veg + "\n";
        }
        return s;
    }

    public String getVegetable(String description){
        for (Product veg : vegetableList) {
            if (veg.getDescription().equals(description)) {
                return veg.toString();
            }
        }
        return "Does not exist in list";
    }

}

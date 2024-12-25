import java.util.ArrayList;

public class TillSystem {

    private ArrayList<Product> scannedProducts;
    private double totalPrice;

    public TillSystem () {
        scannedProducts = new ArrayList<>();
        totalPrice = 0;
    }

    public void addProduct (Product product) {
        scannedProducts.add(product);
    }

    public void removeProduct (Product product) {
        scannedProducts.remove(product);
    }

    public double calculateTotal() {
        for (Product product : scannedProducts) {
            totalPrice += product.calculateSubTotal();
        }
        return totalPrice;
    }


}

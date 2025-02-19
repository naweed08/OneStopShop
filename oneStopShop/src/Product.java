import java.time.LocalDate;
import java.util.logging.Level;

public class Product {
    private final String description;
    private double price;
    private int quantity;
    private double subTotal;
    private LocalDate expiryDate;

    public Product(String description, double price, int quantity, LocalDate expiryDate){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = 0;
        this.expiryDate = expiryDate;
    }

    /** Returns the description of a product
     *
     * @return the description of a product
     */
    public String getDescription(){
        return this.description;
    }

    /** Sets the stock level for a product
     *
     * @param quantity - sets an integer value of available products
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /** Changes the price of a product if required
     * later on.
     * @param price - changes set price at initialization to new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Returns the products price
     *
     * @return the current product price
     */
    public double getPrice(){
        return this.price;
    }

    /** Returns the subTotal for each product,
     * For example, customers buys 3 apples, each apple
     * costs 1.20. The subTotal would be calculated by
     * multiplying the price by the quantity.
     *
     * @return the subtotal of current scanned Products at
     * checkout
     */
    public double calculateSubTotal(){
       return this.subTotal = this.price * this.quantity;
    }

    /**
     * Setting date for perishable product
     */
    public void setExpiryDate (LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Returns the current expiry date of a product
     *
     * @return date of product expiry date
     */
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    /** Returns information about a product
     *
     * @return product information as a string
     */
    public String toString(){
        String s = "Description: " + this.description + '\n' +
                "Price: " + this.price + '\n' +
                "Quantity: " + this.quantity + '\n' +
                "Sub Total: " + this.subTotal + '\n' +
                "Expiry Date: " + this.expiryDate;
        return s;
    }
}

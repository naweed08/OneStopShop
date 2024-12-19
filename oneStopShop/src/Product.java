public class Product {
    private final String description;
    private double price;
    private int quantity;
    private double subTotal;

    public Product(String description, double price, int quantity){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = 0;
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

}

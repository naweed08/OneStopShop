import javax.sound.midi.SysexMessage;

public class ProductTester {

    public static void main(String[] args){
        Product p1 = new Product("Basmati Rice 1kg", 5.99, 10);

        // Test 1: Ensure the correct information is returned with no missing values
        System.out.println(p1);
        System.out.println('\n');

        // Test 2: Print only the description using the getDescription method
        System.out.println(p1.getDescription());
        System.out.println('\n');

        // Test 3: Test the setQuantity method by changing the quantity from 10 to 5
        p1.setQuantity(5);
        System.out.println(p1);
        System.out.println('\n');

        // Test 4: Change the price using setPrice method from 5.99 to 6.99
        p1.setPrice(6.99);
        System.out.println(p1);
        System.out.println('\n');

        // Test 5: Print the new price or whatever the price is to see if price change worked
        System.out.println("Price: " + p1.getPrice());
        System.out.println('\n');

        // Test 6: Check what the subTotal for a product is
        System.out.println("Sub Total: " + p1.calculateSubTotal());
        System.out.println('\n');

    }


}

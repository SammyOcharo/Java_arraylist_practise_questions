//Shopping Cart:
//Develop a shopping cart system using ArrayLists.
// Allow users to add products to the cart, remove items, calculate the total price, and display the items in the cart.
// Handle different types of products and quantities.


import java.util.ArrayList;
import java.util.Scanner;

class Product {

    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +", price=" + price;
    }
}

class ShoppingCart{
    private Product product;
    private int Quantity;

    public ShoppingCart(Product product, int Quantity){
        this.product = product;
        this.Quantity = Quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getTotalPrice(){
        return product.getPrice() * Quantity;
    }
}
public class ShoppingCartApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<ShoppingCart> items = new ArrayList<>();

        products.add(new Product("bread", 50.00));
        products.add(new Product("Tea", 40.00));
        products.add(new Product("Chapati", 70.00));

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nShopping Cart");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Here is the available products.");
                    for (int i=0; i<products.size(); i++){
                        System.out.println((i+1)+ " " + products.get(i));
                    }
                    System.out.println("Enter the number of the product you want to add: ");
//                    int product = scanner.nextInt();





                case 2:

                case 3:

                    for (ShoppingCart shoppingCart: items){
                        System.out.println(shoppingCart);
                    }

                case 4:

                case 5:

                default:
                    System.out.println("You have entered an invalid option!");
            }

        }
    }
}

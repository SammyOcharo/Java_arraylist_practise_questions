//Shopping Cart:
//Develop a shopping cart system using ArrayLists.
// Allow users to add products to the cart, remove items, calculate the total price, and display the items in the cart.
// Handle different types of products and quantities.


class Product {

    private String name;
    private String price;

    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
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
}
public class ShoppingCartApp {
}

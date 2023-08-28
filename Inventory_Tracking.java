
//Inventory Tracking:
//Create an inventory tracking system using ArrayLists.
// Store product information (name, quantity, price) and implement functionalities like adding products, updating quantities,
// calculating the total inventory value, and generating reports.


import java.util.ArrayList;

class Products {
    private String name;
    private int quantity;
    private double price;

    public Products(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", quantity=" + quantity + ", price=" + price;
    }
}
public class Inventory_Tracking {

    public static void main(String[] args) {

        ArrayList<Products> inventoryList = new ArrayList<>();

        System.out.println("\nInventory Tracking System");
        System.out.println("1. Add Product");
        System.out.println("2. Update Quantity");
        System.out.println("3. Calculate Total Inventory Value");
        System.out.println("4. Generate Inventory Report");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
    }

}

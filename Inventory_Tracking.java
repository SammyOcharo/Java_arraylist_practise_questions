
//Inventory Tracking:
//Create an inventory tracking system using ArrayLists.
// Store product information (name, quantity, price) and implement functionalities like adding products, updating quantities,
// calculating the total inventory value, and generating reports.


import java.util.ArrayList;
import java.util.Scanner;

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double TotalInventoryPrice(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", quantity=" + quantity + ", price=" + price;
    }
}
public class Inventory_Tracking {

    public static void main(String[] args) {

        ArrayList<Products> inventoryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("\nInventory Tracking System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Quantity");
            System.out.println("3. Calculate Total Inventory Value");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");



            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    inventoryList.add(new Products(name, quantity, price));
                    System.out.println("product added successfully!");

                    break;

                case 2:
                    System.out.println("Inventory list");

                    for(Products products: inventoryList){
                        System.out.println(products.toString());
                    }

                    System.out.print("Enter the name of the product you want to add quantity: ");
                    String product_name = scanner.nextLine();

                    System.out.print("Enter the new quantity: ");
                    int new_product_amount = scanner.nextInt();
                    scanner.nextLine();

                    for (Products products: inventoryList){
                        if (products.getName().equalsIgnoreCase(product_name)){
                            products.setQuantity(new_product_amount);
                        }
                    }

                    System.out.println("New updated product!");
                    for(Products products: inventoryList){
                        System.out.println(products.toString());
                    }

                    break;
                case 3:
                    System.out.println("Total Inventory Price");
                    double TotalPrice = 0;
                    for(Products products: inventoryList){
                        TotalPrice = TotalPrice + products.TotalInventoryPrice();
                    }

                    System.out.print("Total Inventory price is " + TotalPrice);

                    break;
                case 4:
                    System.out.println("Exiting..");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option..");
            }

        }
    }

}

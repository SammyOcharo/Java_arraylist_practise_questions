
//Bank Transaction History:
//Design a program to manage bank transactions for customers.
// Use ArrayLists to store transaction history for each customer.
// Allow customers to deposit, withdraw, and check their balance, and show the transaction history.

import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    public String name;
    public String id;
    public String age;

    public Customer(String name, String id, String age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", id='" + id + '\'' + ", age='" + age + '\'';
    }
}
class Transaction {

    public Customer customer;
    public String amount;

    public String time;

    public Transaction(Customer customer, String amount, String time){
        this.customer = customer;
        this.amount = amount;
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAmount() {
        return amount;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "customer=" + customer + ", amount='" + amount + '\'' + ", time='" + time + '\'';
    }
}
public class BankTransanction {

    public static void main(String[] args) {

        ArrayList<Customer> customer = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Add new Customer.");
            System.out.println("2. List all Customers.");
            System.out.println("3. Delete Customer.");
            System.out.println("4. Show all transactions for a customer.");
            System.out.println("5. Exit");

            System.out.println("Enter option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}

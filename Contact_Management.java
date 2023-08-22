import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String Name;
    private  String Email;
    private String phoneNumber;

    public  Contact(String Name, String Email, String phoneNumber){
        this.Name = Name;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String toString(){
        return "Name: " + Name + "\nPhone Number: " + phoneNumber + "\nEmail: " + Email;
    }
}


public class Contact_Management {
    //Contact Management:
    //Create a program that simulates a contact list. Use an ArrayList to store contact information (name, phone number, email).
    // Implement functionalities like adding a contact, searching for a contact, updating contact details, and deleting a contact.

    public static void main(String[] args) {
        ArrayList<Contact> contactArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contact");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case  1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println(" Enter Email: ");
                    String email = scanner.nextLine();

                    contactArrayList.add(new Contact(name,phoneNumber, email ));

                    System.out.println("Contact added successfully!");


                case 2:
                    System.out.println("Enter Name to search: ");

                    String SearchName = scanner.nextLine();
                    boolean found = false;

                    for (Contact contact: contactArrayList){
                        if (contact.getName().equalsIgnoreCase(SearchName)){
                            System.out.println("Contact Found");
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println(" Contact not found");
                    }

                case 3:
                    System.out.print(" Enter name to update: ");
                    String updateName = scanner.nextLine();

                    found = false;
                    for (Contact contact: contactArrayList){
                        if(contact.getName().equalsIgnoreCase(updateName)){
                            System.out.println("Enter new phone number");
                            String newPhonenumber = scanner.nextLine();
                            System.out.println(" Enter new email: ");
                            String newEmail = scanner.nextLine();

                            contact.setPhoneNumber(newPhonenumber);
                            contact.setEmail(newEmail);

                            System.out.println("Contact updated successfully!");
                        }
                    }
                    if(!found){
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter name to delete: ");
                    String deleteName = scanner.nextLine();

                    for (Contact contact: contactArrayList){
                        if(contact.getName().equalsIgnoreCase(deleteName)){
                            contactArrayList.remove(deleteName);
                            System.out.println("Contact deleted successfully!");
                            break;
                        }
                    }
                    break;

                case 5:
                    if(contactArrayList.isEmpty()){
                        System.out.println("The list is empty");

                    }else {
                        System.out.println("Contact List: ");
                        for (Contact contact: contactArrayList){
                            System.out.println(contact);
                            System.out.println("-------------");

                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;


                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

}

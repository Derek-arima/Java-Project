import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grocerylist {
    public static void main(String[] args) {
        
        List<String> items = new ArrayList<String>();
        String userChoice = ""; 


// This is a while loop that will keep running until the user chooses to exit the program
        while (userChoice !="4"){

            // creating a scanner object that will be used to read the users input
            Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome to your grocery list! what would you like to do?");

            System.out.println("1. Add a new item");
            System.out.println("2. View all items");
            System.out.println("3. Delete an item");
            System.out.println("4. Exit");

            // reading the users input
            userChoice = userInput.next();
            System.out.println("");
            
            // This is a series of if statements that will run based on the users input
            if (userChoice.equals("1")) {
                createItem(items);
            }

            else if (userChoice.equals("2")) {

                viewItems(items);

                System.out.println("");
                System.out.println("");
            }

            else if (userChoice.equals("3")) {

                deleteItem(items);

                System.out.println("");
                System.out.println("");

            }

            else if (userChoice.equals("4")) {
                
                System.out.println("Goodbye!");
                userChoice = "4";
            }

            else {
                System.out.println("Invalid input. Please try again.");
            }

        }
    }

    // This is a method that will create a new item and add it to the list
    static void createItem(List<String> items) {

        Scanner name = new Scanner(System.in);

        System.out.println("Enter the name of the item you would like to add: ");

        String itemName = name.next();

        items.add(itemName);

        System.out.println(itemName + " has been created!");

    }


    // This is a method that will view all the items in the list
    static void viewItems(List<String> items) {

        Iterator<String> iterator = items.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }


    // This is a method that will delete an item from the list

    static void deleteItem(List<String> items) {

        Scanner name = new Scanner(System.in);

        System.out.println("Enter the name of the item you would like to delete: ");

        String itemName = name.next();
        items.remove(itemName);

        System.out.println(itemName + " has been deleted!");
    }


}


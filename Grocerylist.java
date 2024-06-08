import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grocerylist {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        String userChoice = ""; 

        while (userChoice !="4"){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to your grocery list! what would you like to do?");
            System.out.println("1. Add a new item");
            System.out.println("2. View all items");
            System.out.println("3. Delete an item");
            System.out.println("4. Exit");

            userChoice = userInput.next();
            System.out.println("");
            
            
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

    static void createItem(List<String> items) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of the item you would like to add: ");
        String itemName = name.next();
        items.add(itemName);

        System.out.println(itemName + " has been created!");

    }

    static void viewItems(List<String> items) {
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static void deleteItem(List<String> items) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of the item you would like to delete: ");
        String itemName = name.next();
        items.remove(itemName);

        System.out.println(itemName + " has been deleted!");
    }


}


// Using old ArrayList to do task

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Welcome to the store");

        while (true) {
            System.out.print("Add an item to the shopping list (type 'x' to end): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("x")) {
                break;
            }

            System.out.print("Please insert the amount of the item: (type 'x' to end): ");
            int amount = Integer.parseInt(scanner.nextLine());
            
            shoppingList.add(amount + "x " + item);
        }

        for (String item : shoppingList) { 
            System.out.println(item);
        }
        
        System.out.println("Have a nice day!");

        scanner.close();
    }
}


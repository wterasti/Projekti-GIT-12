// Using old ArrayList to do task

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.print("Add item (x = exit) ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("x")) {
                break;
            }

            shoppingList.add(item);
        }

        for (String item : shoppingList) {
            System.out.println(item);
        }

        scanner.close();
    }
}


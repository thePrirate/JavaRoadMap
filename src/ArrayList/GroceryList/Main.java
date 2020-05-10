package ArrayList.GroceryList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItems();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("0 to print instruction");
        System.out.println("1 to print the groceryList");
        System.out.println("2 to add items");
        System.out.println("3 to modify items");
        System.out.println("4 to remove items");
        System.out.println("5 to search items");
        System.out.println("6 to quit");



    }
    public static void printGroceryList(){
        groceryList.printGroceryList();
    }
    public static void addItem(){
        System.out.print("Please enter the item to be added");
        groceryList.addGrocery(scanner.nextLine());
    }
    public static void modifyItems(){
        System.out.print("Enter the item number: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String replacementItem = scanner.nextLine();
        groceryList.modifyGroceryItem((itemNum-1),replacementItem);
        System.out.println("Item number "+(itemNum-1)+" has been replaced with "+replacementItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item number to remove item: ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(pos);
    }

    public static void searchItem(){
        System.out.println("Enter the item to search: ");
        String searchItem = scanner.nextLine();
        scanner.nextLine();
        if (groceryList.findItem(searchItem)!=null){
            System.out.println(searchItem+" has been found");
        } else {
            System.out.println("Item not found");
        }
    }
}

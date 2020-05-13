package Collection.GroceryList;

import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printIns();
        while (!quit){
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printIns();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }
    public static void printIns(){
        System.out.println("0 to print list");
        System.out.println("1 to print list");
        System.out.println("2 to print list");
        System.out.println("3 to print list");
        System.out.println("4 to print list");
        System.out.println("5 to quit");
    }
    public static void addItem(){
        System.out.println("Enter the item to add: ");
        scanner.nextLine();
        groceryList.addGroceryList(scanner.nextLine());
    }
    public static void printList(){
       groceryList.printList();
    }
    public static void removeItem(){
        System.out.println("Enter the item to remove: ");
        groceryList.removeItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter the item to modify the list");
        groceryList.modifyItem(scanner.nextInt(),scanner.nextLine());
    }
}

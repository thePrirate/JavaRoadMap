package ArrayList.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<>();

public void addGrocery(String item){
//    add the item into the grocery list
    groceryList.add(item);
}
public void printGroceryList(){
    System.out.println("You have "+groceryList.size()+" items ");
    for (int i=0;i<groceryList.size();i++){
//        Get the item(index)
        System.out.println(i+1+"."+ groceryList.get(i));
    }
}
public void modifyGroceryItem(int pos, String item){
    groceryList.set(pos, item);
    System.out.println("Grocery item"+(pos+1)+" has been modified");
}
public void removeGroceryItem(int pos){
    String theItem = groceryList.get(pos);
    groceryList.remove(pos);
    System.out.println(theItem+" item "+(pos+1)+" has been removed");
}

public String findItem(String searchItem){
//    boolean isExisted = groceryList.contains(searchItem);
//    find the item of the item parsed in
    int position = groceryList.indexOf(searchItem);
    if (position>=0){
//        get(pos) to return the correct item from the ArrayList
        return groceryList.get(position);
    }
    return null;
}
}

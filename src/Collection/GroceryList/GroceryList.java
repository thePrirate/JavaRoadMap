package Collection.GroceryList;

import java.util.ArrayList;
import java.util.Iterator;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }
    public void printList(){
        System.out.println("You have "+groceryList.size()+" in your grocery list");
        Iterator<String> i = groceryList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
    public void modifyItem( int pos,String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery Item "+(pos+1)+" has been modifed with"+newItem);
    }
    public void removeItem(String item){
        int theItemPos = groceryList.indexOf(item);
        groceryList.remove(theItemPos);
        System.out.println(item+" has been removed");
    }

    public void findItem( String item){
        boolean isExisted = groceryList.contains(item.toLowerCase());
        if (isExisted){
            System.out.println(item+" is in the list");
        } else {
            System.out.println(item+" not found");
        }
    }
}

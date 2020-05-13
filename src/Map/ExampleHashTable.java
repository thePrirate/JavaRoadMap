package Map;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class ExampleHashTable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("white","mau trang");
        hashtable.put("black","mau den");
        hashtable.put("purple","mau tim");

        System.out.println(hashtable);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color");
        String word = scanner.nextLine();

        Set keys = hashtable.keySet();
        for ( Object key : keys){
            if (word.equalsIgnoreCase(key.toString())){
                System.out.println("It means "+ hashtable.get(key));
            }
        }
    }
}


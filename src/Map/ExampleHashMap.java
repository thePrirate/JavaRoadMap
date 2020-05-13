package Map;

import java.util.HashMap;
import java.util.Scanner;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap hashMap =  new HashMap();
        hashMap.put("black","mau den");
        hashMap.put("white","mau trang");
        hashMap.put("pink","mau hong");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a color");
        String color = scanner.nextLine();

        Object meaning = hashMap.get(color);
        System.out.println("It means "+ meaning);
    }
}

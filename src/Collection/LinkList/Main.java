package Collection.LinkList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim",100.30);
        Customer customer1 = customer;
        customer1.setBalance(200.00);
        System.out.println(customer.getBalance());
        System.out.println(customer1.getBalance());


        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(12);
        intArr.add(100);
        intArr.add(41);
        for (int i=0;i<intArr.size();i++){
            System.out.println(i + ": value is "+intArr.get(i));
        }

        intArr.add(1,2);
        intArr.add(0,400);
        for (int i=0;i<intArr.size();i++){
            System.out.println(i + ": value is "+intArr.get(i));
        }
    }
}

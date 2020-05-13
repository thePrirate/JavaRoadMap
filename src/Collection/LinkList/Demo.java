package Collection.LinkList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placetoVist = new LinkedList<String>();
        addInOrder(placetoVist,"Mel l");
        addInOrder(placetoVist,"Sydney");
        addInOrder(placetoVist,"Perth");
        addInOrder(placetoVist,"Candra");
        addInOrder(placetoVist,"NewYork");
        addInOrder(placetoVist,"Britain");
//        System.out.println(placetoVist);
        printList(placetoVist);
        visit(placetoVist);
    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("now visiting "+i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0){
//                0 found, equal value, do not add in
                System.out.println(newCity+" has already been included");
                return false;
            }else if(comparison>0){
//                A comes before B hence, value of comparison is greater than 0
//                move back to B, add A, A takes over B's pos, B will be pushed back to C's pos
//                only ListIterator allows to .previous();
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if(comparison<0){
//                C comes after B hence, C will be added after B, smaller than 0!!!
//                listIterator.next();

            }
        } listIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("no cities in the itenenary");

        } else {
            System.out.println("Now visiting "+ listIterator.next());
            printMenu();
        } while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday is over");
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
//                    check if there has been already an entry there
                    if (listIterator.hasNext()) {
                        System.out.println("now visiting " + listIterator.next());

                    } else {
                        System.out.println("Reach the end of the list");
                        goingForward =false;
                    } break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        } goingForward = false;
                    }
//                    check if there is previous entry
                    if (listIterator.hasPrevious()){
                        System.out.println("now visiting"+ listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("0 to quit");
        System.out.println("1 to move the next destination");
        System.out.println("2 to move to the previous destination");
        System.out.println("3 to print menu");
    }

}

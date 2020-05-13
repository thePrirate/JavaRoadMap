package Collection.LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("java");
        linkedList.add("javascript");
        linkedList.add("javaweb");
        linkedList.add("James");

//        Create list A
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(linkedList);
        System.out.println("List A:");
        showList(listA);

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Hannah");
        listA.retainAll(listB);
        System.out.println("listA:");
        showList(listA);
    }
    public static void showList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}


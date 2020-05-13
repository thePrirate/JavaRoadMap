package Collection.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("Tran van A","222012"));
        list.add(new Student("Tran van B","123212"));
        list.add(new Student("Tran van E","012311"));
        list.add(new Student("Tran van K","901231"));

        Collections.sort(list, new Comparator() {
        @Override
            public int compare(Object o1, Object o2){
            if (o1 instanceof Student && o2 instanceof Student){
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                return s1.getRollNumber().compareTo(s2.getRollNumber());
            }
            return 0;
        }
        });
        System.out.println("\n Sap xep theo roll number");
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getRollNumber());
        }
    }
}

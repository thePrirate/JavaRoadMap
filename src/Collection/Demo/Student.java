package Collection.Demo;

import java.io.Serializable;

public class Student implements Comparable, Serializable {
    private String name;
    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student s =  (Student)o;
            return s.getRollNumber().compareToIgnoreCase(((Student) o).getRollNumber());
        }
        return 0;
    }
}

package CountSort;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Student implements Comparable<Student> { 
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // toString() method for printing student details
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    
}


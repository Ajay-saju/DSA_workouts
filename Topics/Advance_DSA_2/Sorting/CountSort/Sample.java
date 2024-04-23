package CountSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 103));
        students.add(new Student("Charlie", 102));
	
Collections.sort(students);


	for (Student student : students) {
            System.out.println(student);
        }}
}

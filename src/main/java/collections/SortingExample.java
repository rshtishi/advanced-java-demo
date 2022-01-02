package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jim", 23));
        studentList.add(new Student("John", 20));
        studentList.add(new Student("Ana", 25));

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);
        StudentNameComparator studentNameComparator = new StudentNameComparator();
        Collections.sort(studentList,studentNameComparator);
        System.out.println(studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(studentList);



    }
}

package nested;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students;


    public Course(){
        this.name = "Java Advanced";
        this.students = new ArrayList<>();
        this.students.add(new Student("John","10"));
        this.students.add(new Student("Jim","10"));
        this.students.add(new Student("Mary","10"));
    }

    public void print(){
        for(Student student: students){
            student.print();
        }
    }

    private class Student {
        private String name;
        private String grade;
        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public void print() {
            System.out.println(this.name+" "+grade+" "+Course.this.name);
        }
    }
}

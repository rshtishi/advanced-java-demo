package nested;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private Student[] students;
    private int index;

    public Course() {
        this.name = "Java Advanced";
        students = new Student[5];
        index = 0;
    }

    public void register(String name, String grade) {
        if (index >= 5) {
            System.out.println("Cannot register student, course is full!");
            return;
        }
        students[index] = new Student(name, grade);
        index++;
    }

    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private class Student {

        private String name;
        private String grade;

        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append("{ name:")
                    .append(this.name)
                    .append(", grade: ")
                    .append(grade)
                    .append("}");
            return sb.toString();
        }

    }
}

package collections;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String university;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.university = "State University";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public int compareTo(Student o) {
        return age - o.getAge();
    }

    @Override
    public String toString(){
        return "["+name+","+age+"]";
    }
}

package exceptions;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade){
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if(grade<4 || grade>10){
            throw new IllegalArgumentException("Grade should have the range 4...10");
        }
        this.name = name;
        this.grade = grade;
    }


}

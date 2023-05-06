package recapitulate;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] names = new String[]{"John","Jim","Jane","Jake","Ben"};
        print(names);
        String[] others = Arrays.copyOf(names,10);
        others[0]="Jill";
        print(others);
        print(names);

        System.out.println(Student.getRegisteredStudentNo()); // 0

        Student s1 = new Student("Jane","Doe");
        Student s2 = new Student("Jim","Keller");
        System.out.println(s1.getRegisteredStudentNo()); //2
        System.out.println(s2.getRegisteredStudentNo());  // 2
        System.out.println(Student.getRegisteredStudentNo());  //2
        System.out.println(s1.getRegisteredStudentNo()); //2
        Student.incrementRegisteredStudentNo();
        System.out.println(s1.getRegisteredStudentNo()); //3
        System.out.println(s2.getRegisteredStudentNo());  // 3
        System.out.println(Student.getRegisteredStudentNo());  //3
        System.out.println(s1.getRegisteredStudentNo()); //3
    }

    public static void print(String[] array){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


}

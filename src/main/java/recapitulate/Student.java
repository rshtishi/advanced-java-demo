package recapitulate;

public class Student {

    private static int registeredStudentNo;

    static {
        registeredStudentNo = 0;
    }

    public static int getRegisteredStudentNo(){
        return registeredStudentNo;
    }

    public static void incrementRegisteredStudentNo(){
        registeredStudentNo++;
    }

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        if(firstName==null || lastName== null){
            throw new RuntimeException("Invalid object");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        registeredStudentNo++;
    }

    public String getFirstName(){
        return firstName;
    }


}

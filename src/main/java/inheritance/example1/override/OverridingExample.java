package inheritance.example1.override;

public class OverridingExample {

    public static void main(String[] args) {
        //toString
        Person person = new Person();
        System.out.println(person);

        Employee employee = new Employee();
        System.out.println(employee);

        //Equals
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = employee1;
        System.out.println(employee1 == employee2);
        System.out.println(employee1 == employee3);

        employee1.setEmail("xyz@cc.com");
        employee2.setEmail("xyz@cc.com");
        System.out.println(employee1.equals(employee2));

        //hashcode
        System.out.println(employee1.hashCode());
    }
}

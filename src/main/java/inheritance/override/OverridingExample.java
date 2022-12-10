package inheritance.override;

public class OverridingExample {

    public static void main(String[] args) {
        //toString
        Person person = new Person("Rando",30);
        Person person2 = new Person("rando", 30);
        System.out.println(person==person2);
        System.out.println(person.equals(person2));


        Employee employee = new Employee();
        employee.setEmail("rs@gmail.com");
        System.out.println(employee.toString());

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

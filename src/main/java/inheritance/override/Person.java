package inheritance.override;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        //Person{name:x, age:0}
        sb.append("{")
                .append("name:")
                .append(name)
                .append(", age:")
                .append(age)
                .append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person other = (Person) obj;
        if(this.name.equals(other.getName())
                && this.age==other.getAge()){
            return true;
        }
        return false;

    }
}

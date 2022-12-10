package inheritance.override;

public class Employee {

    private String email;
    private String position;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if ( !(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return this.email.equals(employee.getEmail());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ email:").append(email).append(",")
                .append(" position:").append(position).append(",")
                .append(" age:").append(age).append("]");
        return stringBuilder.toString();
    }

    @Override
    public int hashCode(){
        return 15;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

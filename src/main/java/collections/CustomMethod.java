package collections;

public class CustomMethod {

    private String name;

    public CustomMethod(String name){
        this.name = name;
    }

    public void execute(){
        System.out.println(name+"method executed");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomMethod{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

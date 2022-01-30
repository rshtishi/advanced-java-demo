package collections;

public class Request {

    private String type;
    private String process;

    public Request(String type,String process){
        this.type = type;
        this.process = process;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{");
        sb.append("type='").append(type).append('\'');
        sb.append(", process='").append(process).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

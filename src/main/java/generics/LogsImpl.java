package generics;

public class LogsImpl implements Logs {
    @Override
    public void info(String message) {
        System.out.println(message);
    }
}

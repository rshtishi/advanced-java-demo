package exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;

/**
 * Runtime Exception
 * Checked Exception
 * Error
 */
public class ExceptionExample {

    public static void main(String[] args) {

        Money money = new Money(-1,"");
        //runtime exception
        System.out.println("  Arihmetic Exception");
        try {
            System.out.println(divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("\n  Number Format Exception");
        try {
            int num = Integer.parseInt("x");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n  Class Cast Exception");
        try {
            Object object = new String();
            File file = (File) object;
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //checked exception
        System.out.println("\n  IOException");
        try {
            String content = read("no-file");
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("\n  UnsupportedOperationException");
        try {
            getDataFromDatabase();
        } catch (SQLException | UnsupportedOperationException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

    public static String getDataFromDatabase() throws SQLException {
        throw new UnsupportedOperationException();
    }

    public static double divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static String read(String path) throws IOException {
        return String.valueOf(Files.readAllBytes(Paths.get(path)));
    }
}

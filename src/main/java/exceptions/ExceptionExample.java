package exceptions;

import inheritance.override.Person;

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

    public static double balance;

    public static void withdrawMoney(double amount){
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount, amount cannot be negative");
        }
        if(balance-amount<0){
            throw new IllegalStateException("Not enought credit in you account");
        }

    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello 1");
        try{
            withdrawMoney(5);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Student student = new Student(" ",2);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hello 2");
        try {
            Money money = new Money(-5, "");
        } catch(IllegalArgumentException e){
            System.out.println("******");
        } catch(IllegalStateException e){
            System.out.println("#####");
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

        //custom exception
        PersonService personService = new PersonService();
        try {
            personService.findByName("Rando");
        } catch(PersonNotFoundException e){
            System.out.println(e);
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

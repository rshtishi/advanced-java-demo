package exceptions;

import java.io.File;

/**
 * Runtime Exception
 * Checked Exception
 * Error
 */
public class ExceptionExample {

    public static void main(String[] args) {

        //runtime exception
        System.out.println("  Arihmetic Exception");
        try {
            System.out.println(divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n  Number Format Exception");
        try {
            int num = Integer.parseInt("x");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n  Class Cast Exception");
        try {
            Object object = new String();
            File file = (File) object;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        //checked exception


    }

    public static double divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

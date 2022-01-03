package io;

import java.io.*;

public class PrintWriterExample {

    public static void main(String[] args){
        File destination = new File("src/main/resources/test/test6");
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(destination)))) {
            out.print("Today's weather is: ");
            out.println("Sunny");
            out.print("Today's temperature at the zoo is: ");
            out.print(1/3.0);
            out.println('C');
            out.format("It has rained 10.12 inches this year");
            out.println();
            out.printf("It may rain 21.2 more inches this year");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

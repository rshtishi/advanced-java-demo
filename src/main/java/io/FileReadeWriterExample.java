package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadeWriterExample {

    public static void main(String[] args) {
        File source = new File("src/main/resources/file-test.txt");
        File destination = new File("src/main/resources/test/test4");
        List<String> data = readFile(source);
        writeFile(data,destination);
    }

    public static List<String> readFile(File source) {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static void writeFile(List<String> data, File destination){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(destination))){
            for(String line:data){
                writer.write(line);
            }
            System.out.println("The data were sucessfully written in file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

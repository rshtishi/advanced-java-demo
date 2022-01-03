package io;

import java.io.*;

public class IOStreamsExample {

    public static void main(String[] args) {
        File source = new File("src/main/resources/file-test.txt");
        File destination = new File("src/main/resources/test/test2");
        copy(source, destination);
        destination = new File("src/main/resources/test/test3");
        fastCopy(source, destination);
    }

    public static void copy(File source, File destination) {
        try (InputStream inputStream = new FileInputStream(source)) {
            OutputStream outputStream = new FileOutputStream(destination);
            int b;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }
            System.out.println("The copy operation finished successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fastCopy(File source, File destination) {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(source))) {
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destination));
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer,0,lengthRead);
                outputStream.flush();
            }
            System.out.println("The fast copy operation finished successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

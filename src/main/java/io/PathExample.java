package io;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {

        Path absolutePath = Paths.get("/home/rando/IdeaProjects/advanced-java-demo/src/main/resources/file-test.txt");
        Path relativePath = Paths.get("src/main/resources/file-test.txt");

        System.out.println(absolutePath.toFile().getName());
        System.out.println(relativePath.toFile().getName());

        System.out.println(absolutePath.getParent());
        System.out.println(relativePath.getParent());
        System.out.println(absolutePath.getRoot());
        System.out.println(relativePath.getRoot());
        System.out.println(absolutePath.isAbsolute());
        System.out.println(relativePath.isAbsolute());

        Path subPath = absolutePath.subpath(0, 3);
        System.out.println(subPath.getParent());
        System.out.println(subPath.toFile().getName());

        Path newPath = Paths.get("src/main/resources/file-test2.txt");

        try {
            Files.copy(relativePath, newPath);
            System.out.println("copied successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path movePath = Paths.get("src/main/resources/test/file-test3.txt");
        try {
            Files.move(newPath, movePath);
            System.out.println("Moved successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            Files.delete(newPath);
            System.out.println("Deleted successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            Files.deleteIfExists(movePath);
            System.out.println("Delete successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path dirPath = Paths.get("/home/rando/IdeaProjects/advanced-java-demo/src");

        try {
            Files.walk(dirPath).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

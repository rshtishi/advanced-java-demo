package io;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        //absolute path
        File directory = new File("/home/rando/IdeaProjects/advanced-java-demo/src/main/resources/test");
        System.out.println("is file: " + directory.isFile());
        System.out.println("is directroy: " + directory.isDirectory());
        System.out.println("Directory Name: " + directory.getName());
        System.out.println("Absolute Path: " + directory.getAbsolutePath());
        System.out.println("Parent Path: " + directory.getParent());

        System.out.println("\nTraversing directory: "+directory.getName());
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                String messagePart = file.isDirectory() ? "is directory." : "is not directory.";
                StringBuilder stringBuilder = new StringBuilder();
                String message = stringBuilder.append(file.getName())
                        .append(messagePart).toString();
                System.out.println(message);
                printFileInformation(file);
            }
        }
    }

    private static void printFileInformation(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File length: ").append(file.length())
                .append(", File last modified: ").append(file.lastModified())
                .append(", Is hidden file: ").append(file.isHidden());
        System.out.println(stringBuilder.toString());
    }
}

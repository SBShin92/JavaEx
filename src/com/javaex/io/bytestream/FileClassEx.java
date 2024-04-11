package com.javaex.io.bytestream;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Arrays;

public class FileClassEx {

    private static String rootPath =
            System.getProperty("user.dir") +
                    "\\filesForFileClass";

    public static void main(String[] args) {
        File f = new @NotNull File(rootPath);

        System.out.println("==== root? ====");
        System.out.println(rootPath);
        System.out.println("==== print Files Information ====");
        printFileInfo(f);
    }

    private static void printFileInfo(File f) {

        if (f.isDirectory()) {
            System.out.println(rootPath);
            File[] fileList = f.listFiles();
            Arrays.stream(fileList)
                    .forEach((obj) -> {
                        System.out.print("File in directory: ");
                        System.out.print(obj.getName() + "\t\t");
                        System.out.print(obj.canRead() ? 'r' : '.');
                        System.out.print(obj.canWrite() ? 'w' : '.');
                        System.out.println(obj.canExecute() ? 'x' : '.');
                    });
        } else if (f.isFile()) {
            System.out.print("File: ");
            System.out.print(f.getName() + "\t\t");
            System.out.print(f.canRead() ? 'r' : '.');
            System.out.print(f.canWrite() ? 'w' : '.');
            System.out.println(f.canExecute() ? 'x' : '.');
        } else {
            System.out.println("'" + f + "' does not file or directory.");
        }
    }
}

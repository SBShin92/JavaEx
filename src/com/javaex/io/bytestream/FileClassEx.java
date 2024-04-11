package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileClassEx {

    private static String rootPath =
            System.getProperty("user.dir") +
                    "\\filesForFileClass";

    public static void main(String[] args) {
        File f = new File(rootPath);
        File newDir = new File(rootPath + "\\mkdirByProgram");
        File newFile = new File(newDir.getPath() + "\\myFile.txt");

        System.out.println("rootPath: " + rootPath);
        System.out.println();

        System.out.println("==== print Files Information ====");
        printFileInfo(f);
        System.out.println();

        System.out.println("===== create directory ======");
        createDirectory(newDir);
        System.out.println();

        System.out.println("===== create file in directory ======");
        createMyFile(newFile);
        System.out.println();

        /* 생성한 파일을 삭제하고 싶으면 아래 주석 제거 */
//        if (newDir.exists()) {
//            if (newFile.exists()) {
//                newFile.delete();
//                System.out.println(newFile.getName() + " is deleted");
//            }
//            newDir.delete();
//                System.out.println(newDir.getName() + " is deleted");
//        }
    }

    private static void printFileInfo(File f) {
            File[] files = f.listFiles();

        if (f.isDirectory()) {
            System.out.println("d " + f.getPath());
            for (File file: files) {
                if (file.isDirectory())
                    printFileInfo(file); // 하위 디렉토리까지 색인
                System.out.print("f ");
                System.out.print(file.canRead() ? 'r' : '.');
                System.out.print(file.canWrite() ? 'w' : '.');
                System.out.print(file.canExecute() ? 'x' : '.');
                System.out.print(" \t " + file.getName() + "\t\t");
                System.out.print(file.length());
                System.out.println();
            }
        } else if (f.isFile()) {
            System.out.println(f.getPath() + " is File.");
            System.out.print("f ");
            System.out.print(f.canRead() ? 'r' : '.');
            System.out.print(f.canWrite() ? 'w' : '.');
            System.out.print(f.canExecute() ? 'x' : '.');
            System.out.print(" \t " + f.getName() + "\t\t");
            System.out.print(f.length());
            System.out.println();
        } else {
            System.out.println("'" + f + "' does not file or directory.");
        }
    }

    private static void createDirectory(File newDir) {
        if (!newDir.isDirectory() && newDir.mkdirs()) {
            System.out.println(newDir.getName() + " directory created");
            System.out.println("path: " + newDir);
        } else {
            System.out.println(newDir.getName() + " is already exist");
            System.out.println("path: " + newDir);

        }
    }

    private static void createMyFile(File newFile) {
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
                System.out.println("File 생성");
            } catch (IOException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        } else {
            System.out.println(newFile.getName() + " is already exist");
            System.out.println("path: " + newFile.getPath());
        }
    }
}

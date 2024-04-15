package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	private static String rootPath = 
			System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String fileName =
			rootPath + "thieves.txt";
	public static void main(String[] args) {
		System.out.println(fileName);
		File file = new File(fileName);
		if (file.exists())
			scanFile(file);
		
	}
	private static void scanFile(File file) {
		String name;
		float height;
		float weight;
		
		try (
			Scanner sc = new Scanner(file);			
		) {
			while (sc.hasNextLine()) {
				name = sc.next();
				height = sc.nextFloat();
				weight = sc.nextFloat();
				sc.nextLine();
				System.out.printf("%s %f %f%n", name, height, weight);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

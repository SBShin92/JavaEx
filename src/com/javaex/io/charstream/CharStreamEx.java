package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String filename = rootPath + "myFile.txt";

	public static void main(String[] args) {
		writeFile();

		System.out.println("==========================");
		readfile();
		
//		File f = new File(filename); // 생성된 파일 지우려면 주석 해제 후 실행
//		if (f.exists())
//			f.delete();
	}

	private static void readfile() {
		System.out.println("파일명 : " + filename);
		int data = 0;
		String message = "";

		try (
			Reader reader = new FileReader(filename)
			) {			
			while ((data = reader.read()) != -1) {
				System.out.println("읽은데이터 : " + (char)data);
				message += (char)data;
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
		System.out.println(message);
	}

	private static void writeFile() {
		System.out.println("파일명 : " + filename);

		try (Writer writer = new FileWriter(filename, false)) {
			System.out.println("write start");

			writer.write("My Study\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2024.24\r\n");
			writer.flush();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		System.out.println("done");
	}
}

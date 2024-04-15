package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	private static String rootPath = 
			System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String fileName =
			rootPath + "thieves.txt";
	public static void main(String[] args) {
		System.out.println(fileName);
		
		try (
			Reader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
		) {
			String getLine;
			
			while ((getLine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(getLine, " ");
				while (st.hasMoreTokens())
					System.out.print(st.nextToken() + " ");
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

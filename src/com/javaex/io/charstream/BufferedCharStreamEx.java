package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf_filtered.txt";
	
	public static void main(String[] args) {
		
		System.out.println("원본파일 : " + source);
		System.out.println("필터파일 : " + target);
		try (
				Reader fr = new FileReader(source);
				Writer fw = new FileWriter(target);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);				
			) {
			
			String strTmp = "";
			while ((strTmp = br.readLine()) != null) {
				if (strTmp.toLowerCase().contains("leaves") ||
						strTmp.toLowerCase().contains("leaf")) {
					System.out.println(strTmp);
					bw.write(strTmp);
					bw.newLine();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());			
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		
//		File f = new File(target); // 생성된 파일 지우려면 주석 해제 후 실행
//		if (f.exists())
//			f.delete();
	}
}

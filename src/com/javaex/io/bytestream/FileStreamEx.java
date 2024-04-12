package com.javaex.io.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	private static String rootPath =
			System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String source =
			rootPath + "img.jpg";
	private static String target =
			rootPath + "img_copy.jpg";
	public static void main(String[] args) {
		System.out.println("rootPath : " + rootPath);
		System.out.println("원본 : " + source);
		System.out.println("타겟 : " + target);

		try (
				InputStream fis = new FileInputStream(source);
				OutputStream fos = new FileOutputStream(target);
				) {
			int data = 0;
			System.out.println("copy start");
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		}
		System.out.println("done.");
		

//		File f = new File(target); // 생성된 파일 지우려면 주석 해제 후 실행, 오래 걸리니 물리적으로 지우는 것을 추천
//		if (f.exists())
//			f.delete();
	}
}

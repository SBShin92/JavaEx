package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String source = rootPath + "img.jpg";
	private static String target = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		System.out.println("원본:" + source);
		System.out.println("복제본:" + target);
		
		try (
				InputStream fis = new FileInputStream(source);
				OutputStream fos = new FileOutputStream(target);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			byte[] data = new byte[1024 * 1024];
			int size = 0;
			
			while ((size = bis.read(data)) != -1) {
				System.out.println("copied size : " + size);
				bos.write(data);
			}
		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
	}
}

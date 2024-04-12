package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\filesForFileClass\\";
	private static String filename = rootPath + "primitives.bin";
	
	public static void main(String[] args) {
		
		writePrimitives();
		
		readPrimitives();
		
		
		
	}

	private static void writePrimitives() {
		try (
			OutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);	
		) {
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);

			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(99.9f);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void readPrimitives() {
		System.out.println("파일이름 : " + filename);
		
		try (
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
		) {
			for (int i = 0; i < 2; i++) {
				System.out.println(dis.readUTF());
				System.out.println(dis.readBoolean());
				System.out.println(dis.readInt());
				System.out.println(dis.readFloat());
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		try (Socket socket = new Socket();
				Scanner sc = new Scanner(System.in);){
			System.out.println("Client Start: Connecting...");
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 9999);
			socket.connect(remote);
			System.out.println("Connected.");
			
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				System.out.print("> ");
				String inputString = sc.nextLine().trim();
				
				if (inputString.equals("/q")) {
					System.out.println("Disconnected. quit.");
					break;
				}
				bw.write(inputString);
				bw.newLine();
				bw.flush();
				
				System.out.println(br.readLine());
			}
			bw.close();
			br.close();
		} catch (IllegalArgumentException e) {
			System.err.println("유효한 포트숫자가 아닙니다. 범위: [0-65535]");
		} catch (ConnectException e) {
			System.err.println("접속 거부");
		} catch (IOException e) {
			System.err.println("IO예외");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

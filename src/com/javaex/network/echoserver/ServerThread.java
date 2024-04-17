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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerThread extends Thread {

	private Socket socket;
	private String clientInfo;
	
	
	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
		clientInfo = socketAddress.getAddress() + ": " + socketAddress.getPort();
		System.out.println(clientInfo + " is connected.");
		
		try (InputStream is = socket.getInputStream();
				Reader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr);

				OutputStream os = socket.getOutputStream();
				Writer osw = new OutputStreamWriter(os, "UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);) {
			
			while (true) {
				String inputString = br.readLine();
				
				if (inputString == null) {
					System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("(ahh:mm:ss)")) + 
							clientInfo + " Disconnected.");
					break ;
				}
				
				System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("(ahh:mm:ss)")) + 
						clientInfo + ": " + inputString);
				bw.write("[Echo]:" + inputString);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			System.err.println("바인딩 실패. 이미 사용중인 포트일 수 있습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

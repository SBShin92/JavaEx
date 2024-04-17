package com.javaex.network.v2;

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
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Server {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket()) {
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 9999);
			serverSocket.bind(local);
			
			System.out.println("Server Started: Waiting...");
			
			Socket socket = serverSocket.accept();
			
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("Client found. Connected.");
			System.out.println(socketAddress.getAddress() + ": " + socketAddress.getPort());
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				String inputString = br.readLine();
				if (inputString == null) {
					System.out.println("Disconnected.");
					break;
				}
				System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ahh:mm:ss ")) +
						": " + inputString);
				
				bw.write("[Echo]: " + inputString);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (IllegalArgumentException e) {
			System.err.println("유효한 포트숫자가 아닙니다. 범위: [0-65535]");
		} catch (SecurityException e) {
			System.err.println("허용되지 않는 접근입니다.");
		} catch (IOException e) {
			System.err.println("바인딩 실패. 이미 사용중인 포트일 수 있습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

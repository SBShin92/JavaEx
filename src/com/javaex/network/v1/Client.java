package com.javaex.network.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		try (Socket socket = new Socket()){
			System.out.println("Client Start: Connecting...");
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 9999);
			socket.connect(remote);
			System.out.println("Connected.");
			
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

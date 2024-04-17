package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

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

package com.javaex.network;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;


public class InetAddressEx {
	public static void main(String[] args) {

		printLocalIp();
		System.out.println("----------------------------");
		
		printServerIp("naver.com");
		printServerIp("www.google.com");
	}
	
	private static void printServerIp(String domain) {
		try {
			InetAddress[] hosts = InetAddress.getAllByName(domain);
			for (InetAddress remote: hosts) {
				System.out.println(remote);
			}
		} catch (UnknownHostException e) {e.printStackTrace();};
	}
	
	private static void printLocalIp() {
		try {
			InetAddress local = InetAddress.getLocalHost();	
			System.out.println(local);
		} catch (UnknownHostException e) {e.printStackTrace();};
	}
}

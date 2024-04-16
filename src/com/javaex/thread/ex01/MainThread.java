package com.javaex.thread.ex01;

public class MainThread {
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		/* 람다식 */
		Runnable sub2 = () -> {
			try {
				for (char c = 'ㄱ'; c <= 'ㅎ'; c++) {
					System.out.println("kor : " + c);
					Thread.sleep(100);
				}
				System.out.println("*****" + Thread.currentThread().getName() + " 종료");
			} catch (Exception e) {}
		};
		Thread thread2 = new Thread(sub2);
		Thread thread3 = new Thread(new AlphabetRunnable());
		thread.start();
		thread2.start();
		thread3.start();
		try {
			for (char c = 'A'; c <= 'Z'; c++) {
				System.out.println("Main : " + c);
				Thread.sleep(100);
			}
		} catch (Exception e) {}
		System.out.println("*****" + Thread.currentThread().getName() + " 종료");
	}
}

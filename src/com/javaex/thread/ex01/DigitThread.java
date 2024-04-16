package com.javaex.thread.ex01;

/* Thread 클래스 상속 받아 오버라이딩 */
public class DigitThread extends Thread {
	@Override
	public void run() {
		try {
			for (int d = 0; d < 25; d++) {
				System.out.println("dig : " + d);
				Thread.sleep(100);
			}
		} catch (Exception e) {}
		System.out.println("*****" + Thread.currentThread().getName() + " 종료");
	}
}

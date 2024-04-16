package com.javaex.thread.ex02;

/* Runnable 인터페이스 구현 */
public class AlphabetRunnable implements Runnable {
	@Override
	public void run() {
		try {
			for (char c = 'a'; c < 'z'; c++) {
				System.out.println("alp : " + c);
				Thread.sleep(100);
			}
		} catch (Exception e) {}
		System.out.println("*****" + Thread.currentThread().getName() + " 종료");
	}
}

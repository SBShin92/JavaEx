package com.javaex.thread.ex02;

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
		
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
			thread2.join();
			thread3.join();
		} catch (Exception e) {}
		System.out.println("*****" + Thread.currentThread().getName() + " 종료");
	}
}

package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("Main: refcount: " + s1.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("Main: refcount: " + s2.refCount);
		
		StaticEx s3 = new StaticEx();
		System.out.println("Main: refcount: " + StaticEx.refCount);
		
		s3 = null;
		System.out.println("s3 해제");
		System.out.println("refcount: " + StaticEx.refCount);
		
		
		System.gc();
		try {
			Thread.sleep(1000);
			System.out.println("refcount: " + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
	
}

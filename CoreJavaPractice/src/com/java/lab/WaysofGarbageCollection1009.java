package com.java.lab;

public class WaysofGarbageCollection1009 {
	@Override
	protected void finalize() throws Throwable {
			
		System.out.println("Finalize method called !");
	}
//	4. Out of scope -> Method scope is ended then Object is eligible for GC.
	public void hi() {
		WaysofGarbageCollection1009 w3 = new WaysofGarbageCollection1009();
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		WaysofGarbageCollection1009 w1 = new WaysofGarbageCollection1009();
		
		WaysofGarbageCollection1009 w2 = new WaysofGarbageCollection1009();
		
		System.out.println("Method Generated Hashcode (w1) : " +w1.hashCode());
		
		int wOne = 0x27716f4;
		System.out.println("Manual Hashcode (w1) : "+wOne);
		
		System.out.println("Method Generated Hashcode (w2) : " +w2.hashCode());
		
		int wTwo = 0x2a84aee7;
		System.out.println("Manual Hashcode (w2) : "+wTwo);
		
		System.out.println(w1); // com.java.lab.WaysofGarbageCollection1009@27716f4
		System.out.println(w2); // com.java.lab.WaysofGarbageCollection1009@2a84aee7
		
//		1. Nullifying the Object
		w1 = null;
		
//		2. Re-assigning the object
		w2 = w1;
		
//		3. Anonymous Object
		new WaysofGarbageCollection1009().hi();
		

		
		
		
		System.gc();
		
		
	}
}

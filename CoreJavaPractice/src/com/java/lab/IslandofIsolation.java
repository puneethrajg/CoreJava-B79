package com.java.lab;
//	5. Way to make the object eligible for GC

class A {
	B bb;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("A Finialize Method Called !");
	}
}

class B {
	
	A aa;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("B Finialize Method Called !");
	}
}

public class IslandofIsolation {
	
	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.bb = obj2;
		obj2.aa = obj1;
		
		obj1 = null;
		
		obj2 = null;
		
		System.gc();
		
	}

}

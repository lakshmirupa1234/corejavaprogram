package com.tnsif.finallyblock;
//exception with no matching catch block
public class Test2 {
    public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException npe) {
			System.out.println("exception caught");
		}
		finally {
			System.out.println("welcome");
		}
		System.out.println("hello");

	}

}

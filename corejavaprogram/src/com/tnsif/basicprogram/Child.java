package com.tnsif.basicprogram;

public class Child extends Overriding{
	public void activity() {
		System.out.println("working");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.activity();
	}

}

package com.tnsif.basicprogram;

public class Nestedinterface implements Maininterface.Myinnerinterface{

	@Override
	public void display() {
		System.out.println("my inner interface d is "+d);
		
	}
	public static void main(String[] args) {
		Nestedinterface ni= new Nestedinterface();
		ni.display();
	}

}

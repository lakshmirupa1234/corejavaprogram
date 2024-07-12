package com.tnsif.multithreadingdemo;

public class Implementingthread implements Runnable {
public static void main(String[] args) {
	

	
	 Implementingthread r=new Implementingthread();
	 
	// r.start();
	 
	 Thread d=new Thread(r);
           d.start();
}
	 
	 @Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("implmenting runnable interface  ");
		}

}


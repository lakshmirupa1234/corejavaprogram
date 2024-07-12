package com.tnsif.Synchronizationdemo;

public class R extends Thread {
	Block b;
	R(Block b){
		this.b=b;
		
	}
public void run() {
	b.display();
}
}

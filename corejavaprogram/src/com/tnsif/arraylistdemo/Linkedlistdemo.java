package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("anil");
		l.add(4);
		l.add("rupa");
		l.add(8.9);
		System.out.println("After invoking add() "+l);
		l.add(1,"apple");
		l.add("d");
		
		System.out.println(1);
		
		LinkedList l1=new LinkedList();
		l1.add(l1);
		l1.add("ds");
		l1.add(l);
		
		//System.out.println(l1);
		
		l1.addFirst("d");
		l1.addFirst("vasu");
		l1.remove(0);
		System.out.println(l1);
		
		
		
	}

}

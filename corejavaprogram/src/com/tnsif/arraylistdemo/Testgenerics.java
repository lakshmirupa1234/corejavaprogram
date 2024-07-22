package com.tnsif.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
//demo for generic
public class Testgenerics {
	public static void main(String[] args) {
		
	
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("anil");
	a1.add("rupa");
	a1.add("vasu");
	
	//a1.add(6);  compile time error
	
	System.out.println("elements "+a1);
	
	Iterator<String> itr=a1.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	

}
}

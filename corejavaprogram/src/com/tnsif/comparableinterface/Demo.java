package com.tnsif.comparableinterface;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		//ArrayList<String>  al=new ArrayList<String>();
		
	//	al.add("rtef");
		//user defined or customed class
		ArrayList<Student>  al1=new ArrayList<Student>();
		Student s=new Student(103,"Anil","cse");
		Student s1=new Student(104,"Rupa","cse");
		Student s3=new Student(105,"Vasu","cse");
		
		al1.add(s);
		al1.add(s1);
		al1.add(s3);
		
		System.out.println(al1);
		
		
		
		
	}

}

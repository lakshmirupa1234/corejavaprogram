package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		//ArrayList<String>  al=new ArrayList<String>();
		
	//	al.add("rtef");
		//user defined or customed class
		ArrayList<Student>  al1=new ArrayList<Student>();
		Student s=new Student(108,"Rupa","cse");
		al1.add(s);
		Student s1=new Student(106,"Anil","cse");
		al1.add(s1);
		Student s3=new Student(105,"Vasu","cse");
		al1.add(s3);
		
		
		System.out.println("before sorting "+al1);
		
		System.out.println("after sorting ");
		
		Collections.sort(al1);
		System.out.println(al1);
		
		
	}

}

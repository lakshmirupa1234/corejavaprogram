package com.tnsif.staticexamples;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"rupa");
		Student s2=new Student(2,"vasu");
     	Student s3=new Student(3,"nandu");
	s1.display();
	s2.display();
	s3.display();
	}

}

package com.tnsif.streamapi;

import java.util.stream.Stream;


public class Skipexample {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.filter(num->num%2==0)//FILTER EVEN NO
		//.skip(2)//first two elements
		.limit(2)
		.forEach(num->System.out.println(num + " "));
	}

}

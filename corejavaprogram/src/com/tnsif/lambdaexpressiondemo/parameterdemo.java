package com.tnsif.lambdaexpressiondemo;

public class parameterdemo {
	public static void main(String[] args) {
		Cube c=(a)->{return(a*a*a);};     //lambda expression syntax
		System.out.println("cube of  a number "+c.calculate(3));
		}
	}



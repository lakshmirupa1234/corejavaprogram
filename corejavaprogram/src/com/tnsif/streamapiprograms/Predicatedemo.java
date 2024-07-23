package com.tnsif.streamapiprograms;
//to demonstrate predicate interface
import java.util.function.Predicate;

public class Predicatedemo {
	public static void main(String[] args) {
		
	
	Predicate<Integer> pr=a->(a>18);
	System.out.println(pr.test(7));//creating predicate
}

}

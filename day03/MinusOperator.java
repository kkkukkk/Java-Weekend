package day03;

public class MinusOperator {
	public static void main(String[] args) {
		System.out.println(10-5);// int - int --> int
		System.out.println(10-3.0);// int - double --> double
		System.out.println(10-'a');// int - char --> int
		//System.out.println(10-"¾È³ç"); String »¬¼À »ç¿ë ºÒ°¡´É
		
		System.out.println(3.5 - 1.5);// double - double --> double
		System.out.println(3.5 - 'A');// double - char --> double
		
		System.out.println('b'-'a'); // char - char --> int
		
	}

}

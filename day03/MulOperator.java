package day03;

public class MulOperator {
	public static void main(String[] args) {
		System.out.println(1*2);// int * int --> int
		System.out.println(0*5.4);// int * double --> double
		System.out.println(0*'a');// int * char --> int
		//System.out.println("¾È³ç"*4); ¿À·ù
		
		System.out.println(0.0 * 1.5); // double * double --> double
		System.out.println(1.0 * 'a'); // double * char --> double
		
		System.out.println('a'*'4'); // char * char --> int
	}

}

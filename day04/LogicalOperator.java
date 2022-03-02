package day04;

public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println("---&&연산---");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		System.out.println("---||연산---");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		System.out.println("---not연산---");
		System.out.println(!true); //false
		System.out.println(!false);//true
		
		
	}
}

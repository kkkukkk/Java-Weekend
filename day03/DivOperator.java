package day03;

public class DivOperator {
	public static void main(String[] args) {
		System.out.println(10/3); // int / int --> int 몫
		System.out.println(10/1.0); // int / double --> double
		System.out.println(100/'a'); // int / char --> int
		
		System.out.println(10.5/10.5); // double / double --> double
		System.out.println(100.0 / 'a'); // double / char --> double
		
		System.out.println('b'/'a'); // char / char --> int
		
		//System.out.println(10/0); 0으로는 나눌 수 없음
		
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		
		System.out.println(10%3 + 7 * 2 / 3 - 1);
	}
}

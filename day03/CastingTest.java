package day03;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println((int)3.14); // double --> int
		System.out.println((double)5); // int --> double
		System.out.println((char)65); // int --> char
		
//		String은 클래스이기 때문에 메소드로 자료형을 바꿔줘야한다
		// String --> int
		// parseInt() 메소드, Integer 클래스에 만들어져있다
		// Integer.parseInt(), .은 안에 있다는 의미
		// Integer.parseInt("10") --> 10
		int num = Integer.parseInt("10");
		// int --> String
		// toString() 메소드, Integer 클래스에 만들어져있다
		String num2 = Integer.toString(10);
		System.out.println(num2 + 7);
		
		//System.out.println(Integer.parseInt("10"));
		
		// String --> double
		// parseDouble() 메소드, Double 클래스에 만들어져있다
		double d = Double.parseDouble("3.14");
		
		// double --> String
		// toString() 메소드, Double 클래스에 만들어져있다
		String d2 = Double.toString(5.154);
		
		//암묵적 형변환
		//연산결과를 활용하는 방법
		System.out.println(10 * 1.0);
		String res = 10 + ""; // 숫자를 문자열로 바꿀 때 많이 쓰이는 방법
		
		double var2 = 10; // 10이 10.0으로 자동 형변환이 되고, 저장된다.
//		int var = 10.5
		
		char target = 't';
		// target에 담긴 소문자를 대문자로 변경하여 출력하라
		// hint) 아스키코드표 참고, 산술연산, 형변환
		
		/*int target2 = target - 32;
		System.out.println((char)target2);*/
		
		System.out.println((char)(target-32));
		
		
		
	}

}

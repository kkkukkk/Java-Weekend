package day08;

public class MethodTest2 {
//	public static int add(int a, int b) {
//		System.out.println(a+b);
//		return 10;
//	} 리턴타입과는 무관하다
	
//	public static void add(int num1, int num2) {
//		System.out.println(num1+num2);
//	} 매개변수 이름과는 무관하다
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	//메소드 오버로딩(overloading)
	//같은 이름의 메소드이지만 매개변수의 갯수가 다른 경우
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	//매개변수의 타입이 다른 경우
	public static void add(double a, int b) {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		
		MethodTest2.add(10.5, 20);
		MethodTest2.add(10,20);
		MethodTest2.add(10,20,30);
	}
	
	
}

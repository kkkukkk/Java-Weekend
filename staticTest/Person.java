package staticTest;

public class Person {
	// static : 해당 클래스의 모든 객체(인스턴스)들이 값을 공유하게 한다
	static String country = "KOREA";// 멤버, 멤버변수, 클래스변수
	String name;// 멤버, 멤버변수, 인스턴스변수
	
	public static void f() { // 스태틱메소드
		// 모든 인스턴스에서 동일하게 동작하는 메소드
		System.out.println("스태틱 메소드");
//		System.out.println(this.name);
		// 스태틱 메소드는 모든 인스턴스에 대해 동일하게 동작해야하기 때문에
		// 인스턴스마다 달라지는 인스턴스 변수는 사용이 불가능하다		
		System.out.println(Person.country);
		// 인스턴스마다 달라지지 않는 클래스 변수는 사용이 가능하다
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

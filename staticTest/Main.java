package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.country = "JAPAN";
		System.out.println(p1.country);
		System.out.println(p2.country);
		System.out.println(Person.country);
		// static 변수는 인스턴스마다 달라지지 않기 때문에 굳이 
		// 인스턴스이름.변수명 으로 사용할 필요가 없다
		// 클래스명.변수명 으로 사용하는것이 바람직하다
		
		
		p1.f();
		p2.f();
		Person.f(); // 스태틱 메소드는 인스턴스마다 실행결과가 달라지지 않기 때문에	
					// 클래스명.메소드명()으로 사용하는 것이 바람직하다
		
		// 문자열을 int로 바꿔주는 메소드
		Integer.parseInt("10");
		String msg = "안녕";
		msg.equals("안녕");
		
		
		
		// access test
		Test t = new Test();
//		t.pri = 10; public만 다른 패키지 다른 클래스에서 접근이 가능하다
//		t.def = 10;
//		t.pro = 10;
		t.pub = 10;
		
//		t.prif(); public만 다른 패키지 다른 클래스에서 접근이 가능하다
//		t.deff();
//		t.prof();
		t.pubf();

		
		
		
		
		
		
		
		
		
		
		
		
	}
}

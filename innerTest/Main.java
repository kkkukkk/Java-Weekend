package innerTest;

import interTest.Soldier;

public class Main {
	public static void main(String[] args) {
		//내부 클래스 스태틱 클래스 객체화
		Outer.InnerStatic oi = new Outer.InnerStatic();
		System.out.println(oi.isv);
		
		// 내부클래스 인스턴스클래스 객체화
		Outer o = new Outer();
		Outer.InnerInstance ii = o.new InnerInstance();
		System.out.println(ii.iiv);
		
		o.f();
		
		System.out.println();
//		클래스.객체.메소드 형태
		
		Soldier s = new Soldier() { //익명 클래스, Soldier 타입으로 오버라이딩 된것
			// 이름이 없으므로 업캐스팅 해도 자식에서 새롭게 정의한 것은 쓸 수 없음
			// 다운캐스팅도 불가능
			// Soldier를 상속받은 클래스, 업캐스팅하여 부모에 넣어주고 있다
			// 이름을 붙히지 않은 이유는 일회성으로만 사용하기 위해서
			int a;
			public void f() {
				System.out.println("메소드");
			}
			@Override
			public void eat() {
				System.out.println("재정의된 eat");
			}
			@Override
			public void work() {
				System.out.println("재정의된 work");
			}
			@Override
			public void sleep() {
				System.out.println("재정의된 sleep");	
			}
		};
//		s.a = 10;
		s.eat(); // 자식에서 재정의 하였으므로 사용 가능
		
		Car c = new Car() { //익명 클래스 필드, Car를 상속받는 클래스
			@Override
			public void engineOn() {// 자식에서 재정의된 메소드
				System.out.println("버튼으로 시동 켬");
			}
			
			public void f() {//자식에서 새롭게 정의된 메소드
				System.out.println("자식에만 존재하는 메소드");
			}// 업캐스팅 되었기 때문에 사용 불가능			
		};
		
		c.name = "안녕";
		c.go();
		c.engineOn();
		
		
		
		
		
	}
}

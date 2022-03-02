package day10;

// SuperCar : 자식클래스, Car: 부모클래스
public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {
		// 부모생성자 호출
		super(); // 부모생성자
		System.out.println("SuperCar 객체 생성됨");
	}
	
	@Override
	public void show() {
//		System.out.println("----차량정보----");
//		System.out.println("차주 : " + this.name);
//		System.out.println("가격 : " + this.price +"만원");
//		System.out.println("색상 : " + this.color);
		// super : 부모를 의미하는 키워드
		super.show(); // 부모에 존재하는 메소드를 호출하여 자식에서 사용할 수 있다
		System.out.println("모드 : " + this.mode );
	}
	// SuperCar클래스는 Car 클래스를 상속받았기 때문에
	// Car클래스에 존재하는 멤버들을 자유롭게 사용할 수 있다.
	public void openRoof() {
		System.out.println("지붕을 열었습니다");
	}
	
	// 메소드 오버 라이딩(over riding) : 재정의
	// 부모클래스에 존재하는 메소드를 같은 이름으로 자식클래스에서 재정의 하는것
	@Override // 어노테이션 주석
	public void engineOn() {
		System.out.println("버튼으로 시동 켰습니다.");
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
	
}

package interTest;

public interface Soldier {
	// 오로지 추상 메소드만 만들 수 있다
//	public void f() {
//		인터페이스에는 일반 구현된 메소드는 만들 수 없다
//	}
	
	// 인터페이스 안에는 오로지 static final 변수만 선언할 수 있고,
	// 초기화를 해야 한다
	static final int num = 10;
	
	public abstract void eat();
	public void work(); // 어짜피 추상 메소드밖에 넣을 수 없기 때문에
						// abstract는 생략 가능하다.
	public void sleep();
	
	
	
	
	
	
	
}

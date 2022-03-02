package abstractTest;

public class Main {
	public static void main(String[] args) {
		//추상 클래스는 필드위에 미구현된 상태가 존재하기 때문에
		//객체화가 불가능하다
//		Parent p = new Parent();
		Child c = new Child();
		c.a = 100;
		c.f1();
		c.f2();
		c.rest();
		
		// 추상클래스 객체화가 아닌,
		// 자식 객체를 부모타입으로 업캐스팅 한 것
		Parent p = new Child();
		p.f2();
		
	}
}

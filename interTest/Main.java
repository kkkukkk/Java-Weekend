package interTest;

public class Main {
	public static void main(String[] args) {
		// final : 변수의 상수화를 진행하는 제어자
		final int num;
		num = 10; // 초기화는 되지만 상수화 되어 다른 값을 대입할 수 없다
//		num = 50;
//		num = 60
		
		System.out.println(Soldier.num);
//		Soldier.num = 15;
		
//		Soldier s = new Soldier(); 인터페이스는 객체화 불가능
									// 미구현된 메소드가 있기 때문에
		
		SecondMan s = new SecondMan();
		s.eat();
		
		Corporal c = new Corporal();
		c.eat();
		
		Soldier s1 = new SecondMan();
		s1.eat();
		Soldier s2 = new Corporal();
		s2.eat();
		
		
		
		
		
		
		
	}
}

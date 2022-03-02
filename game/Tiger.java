package game;

import java.util.Iterator;

public class Tiger extends Animal {

	public Tiger(int hp, int feed) {
		super(hp, feed);
	}
	
	//eat()
	public void eat() {
		this.feed -= 4;
		super.eat();
	}
	
	
	//walk() 부모 메소드 사용
	
	//rest()
	@Override
	public void rest() {
		System.out.println("호랑이 휴식중");
		for (int i = 0; i < 10;i++) {
			System.out.println("!");
		}
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println();
	this.hp += 20;
	this.feed += 20;
	this.show();
	
	}
	
	// Tiger 클래스 안에만 존재하는 메소드
	
	public void onlyTiger() {
		System.out.println("어흥어흥");
	}
	
}

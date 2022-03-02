package game;

public class Dog extends Animal{

	public Dog(int hp, int feed) {
		super(hp, feed);
	}
	
	// eat() : 부모에 정의된 메소드 그대로 사용
	// walk()
	public void walk() {
		this.hp -= 4;
		super.walk();
	}
	
	// rest()
	@Override
	public void rest() {
		System.out.print("강아지 휴식중");
		for (int i = 0; i < 5; i++) {
			System.out.print("!멍멍");
			try {
				// try - catch 단축키
				// 드래그 > alt+shift+z > 아래화살표 > 엔터
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println();
		this.feed += 20;
		this.hp += 20;
		this.show();
	}
	
}

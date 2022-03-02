package game;

public class Animal {
	// 캐릭터들의 부모 클래스
	int hp;
	int feed;
	
	public Animal(int hp, int feed) {
		super();
		this.hp = hp;
		this.feed = feed;
	}

	public void show () {
		System.out.println("현재체력 : " + this.hp);
		System.out.println("현재음식 : " + this.feed);		
	}
	
	public void eat() {
		this.hp++;
		this.feed--;
		this.show();
	}
	
	public void walk() {
		this.hp--;
		this.feed++;
		this.show();
	}
	
	public void rest() {
		System.out.print("휴식중");
		for (int i = 0; i < 2; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
		System.out.println();
		this.hp += 20;
		this.feed += 20;
		this.show();
	}
	
}

package game;

public class Cat extends Animal {

	public Cat(int hp, int feed) {
		super(hp,feed);
	}
	
	//eat
	@Override
	public void eat() {
		this.hp += 2;
		super.eat();
	}
	
	//walk
	public void walk() {
		this.hp -= 4;
		this.feed += 4;
		super.walk();
	}
	
	// rest()
	public void rest() {
		System.out.println("°í¾çÀÌ ÈŞ½ÄÁß");
		for (int i = 0; i < 3; i++) {
			System.out.println("~¾ß¿Ë");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println();
		this.feed += 20;
		this.hp += 20;
		this.show();
		}
	}
}

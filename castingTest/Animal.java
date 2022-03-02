package castingTest;

public class Animal {
	
	public void cry() {
		System.out.println("µ¿¹° ¿ïÀ½¼Ò¸®");
	}
}

class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("²Ü²Ü");
	}
	public void eat() {
		System.out.println("³È³È ¸ÀÀÖ´Ù");
	}
}

class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("¾ß¿Ë¾ß¿Ë");
	}
	public void punch() {
		System.out.println("³É³ÉÆÝÄ¡");
	}
}

class Eagle extends Animal {
	@Override
	public void cry() {
		System.out.println("µ¶¼ö¸®°¡ ¿ï°í ÀÖ¾î¿ä");
	}
	
	public void fly() {
		System.out.println("ÇÏ´ÃÀ» ³¯°í ÀÖ¾î¿ä");
	}
}
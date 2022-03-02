package castingTest;

public class Main {
	// 동물 객체가 들어왔을 경우 동물입니다 라고 출력하는 메소드
	public static void isAnimal(Animal target) {
		target.cry();
		if(target instanceof Eagle) {
			Eagle e = (Eagle)target;
			e.fly();		
		}
		System.out.println("동물입니다");
	}
	public static void main(String[] args) {
		Pig p = new Pig();
		Cat c = new Cat();
		Eagle e = new Eagle();
//		System.out.println(p instanceof Cat);
		Main.isAnimal(p);
		Main.isAnimal(c);
		Main.isAnimal(e);
		
		Animal a = new Animal();
		Test t = new Test();
		String str = "안녕";
		
		Object[] ar = {a, t, p, c, e, str};
		
		
		
		
	}
}

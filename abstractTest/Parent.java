package abstractTest;

public abstract class Parent {
//	static final int num;
	int a;
	
	public void f1() {
		System.out.println("부모클래스에 존재하는 일반메소드");
	}
	
	public abstract void f2();
	
	public abstract void rest();
}

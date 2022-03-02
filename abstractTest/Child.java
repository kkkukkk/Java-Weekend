package abstractTest;

public class Child extends Parent{
	
	@Override
	public void rest() {
		
	}
	
	@Override
	public void f2() {
		System.out.println("자식에서 재정의된 추상메소드");
	}
}

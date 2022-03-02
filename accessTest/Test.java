package accessTest;

public class Test {
	private int pri;
	int def; // 생략하면 default
	protected int pro;
	public int pub;
	
	private void prif() {
		System.out.println("private메소드");
	}
	
	void deff() {
		System.out.println("default메소드");
	}
	
	protected void prof() {
		System.out.println("protected 메소드");
	}
	
	public void pubf() {
		System.out.println("public 메소드");
	}
	public void test() {
		// private, default, protected, public 모두 같은 클래스 내에서는 접근(사용) 가능
		this.prif();
		this.deff();
		this.prof();
		this.pubf();
		System.out.println(this.pri);
		System.out.println(this.def);
		System.out.println(this.pro);
		System.out.println(this.pub);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

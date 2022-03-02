package day08;

public class VariableLifeCycle {
	public static void change(int num) {
		num = 500;
		
	}
	
	
	public static void main(String[] args) {
		int num = 10; // 지역변수 오로지 메인메소드 안에서만 사용 가능
		VariableLifeCycle.change(num);
		System.out.println(num);	
	}
	
	
}

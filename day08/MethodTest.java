package day08;

public class MethodTest {
	public static int add(int a, int b) {
		System.out.println("안녕하세요");
		return a+b;
	}
	
	// return 타입은 return 옆에 있는 값의 타입을 의미한다
	// 이 메소드의 return 타입은?

	public static void main(String[] args) {
		System.out.println(MethodTest.add(1,2) / 2.0);
		// 메소드에 return 타입이 존재한다면
		// 해당 메소드 사용(호출)의 결과를 return 값으로 생각한다
		int num = MethodTest.add(1, 10);
		System.out.println(num);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

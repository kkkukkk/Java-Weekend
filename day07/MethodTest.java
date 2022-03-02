package day07;

public class MethodTest {
	
	
	// public static void 함수명(){
	// }
	
	public static void printName(int cnt, String name) { // 매개변수 파라미터 인자 인수 argument....
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 개발중");
		
		// 클래스명.함수명() : ex) Integer.parseInt();
		MethodTest.printName(2,"배상엽");
		MethodTest.printName(3,"김철수");
		MethodTest.printName(4,"김영희");
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("이름");
//			
//		}	
		
	}
}

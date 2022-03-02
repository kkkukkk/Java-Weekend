package day03;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("---int + ?---");
		int num = 10 + 10;//타입을 알고 있어야지 변수에 알맞게 담아줄 수 있다
		System.out.println(10 + 10); // int + int --> int
		System.out.println(10 + 1.5); // int + double --> double
		System.out.println(10 + 'a'); // int + char --> int (컴퓨터는 문자를 저장할 때 숫자로 저장 아스키코드)
		System.out.println(10 + "안녕"); // int + String --> String (java에서만 숫자+문자는 그냥 연결되어 출력됨)
		
		System.out.println("---double + ?---");
		System.out.println(1.5 + 1.5); // double + double --> double
		System.out.println(1.0 + 1); // double + int --> double
		System.out.println(1.5 + 'a'); // double + char --> double
		System.out.println(1.5 + "안녕"); // double + String --> String
		
		System.out.println("---char + ?---");
		System.out.println('a' + 10); // char + int --> int
		System.out.println('a' + 1.5); // char + double --> double
		System.out.println('a' + 'b'); // char + char --> int
		System.out.println('a' + "안녕"); // char + String --> String]
		
		System.out.println("---String + ?---");
		System.out.println("안녕" + 10); // String + int --> String
		System.out.println("안녕" + 1.5); // String + double --> String
		System.out.println("안녕" + 'a'); // String + char --> String
		System.out.println("안녕" + "하세요"); // String + String --> String
		
		String day = "10";
		System.out.println(day + 5);
		
		System.out.println(10 + "20" + 8);
		
		System.out.println(10 + 3 + 5 + "안녕" + (10 + 2)); // 18안녕12 ()를 사용하면 먼저 계산
		
		System.out.println(10 + "" + 20);
		
		
	}
}

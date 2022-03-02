package day03;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 2); // true
		System.out.println(10 > 20);// false
		
		System.out.println('a' >= 5); // true
		System.out.println('b' >= 'a'); // true
		
//		System.out.println("안녕" >= "반갑습니다"); 문자열은 비교 불가
		System.out.println(10 == 10); // true
		// 문자열이 같은지 비교는 메소드를 통해서 해준다
		// 문자열1.equals(문자열2) --> 두 문자열이 같다면 true, 아니면 false
		System.out.println("안녕".equals("안녕"));
		System.out.println("안녕".equals("반가워"));
		
		// 사용자에게 id를 입력 받아서 id가 admin이라면 true, 
		// 아니면 false를 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.println("id >> ");
		String id = sc.nextLine();
		
		System.out.println(id.equals("admin"));
		//System.out.println("admin".equals(id)); 가독성 차이	
	}
}

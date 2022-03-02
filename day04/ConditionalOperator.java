package day04;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(true ? "참" : 5);
		System.out.println(false ? "참" : 5);
		
		// 사용자에게 나이를 입력 받아서
		// 성인여부를 판단하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();
		
		System.out.println(age > 19 ? "성인" : "미성년자");
		
		
		
		
	}
}

package day04;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 두 정수를 입력 받아(업그레이드)
		// 둘 중 더 큰 수 출력하기, 같은 수라면 같다고 출력하기
		// 입력예시
		// 정수입력 >> 20
		// 정수입력 >> 30
		// 출력예시
		// 30
		// 2. 위에서 입력받은 두 정수의 차(큰 수 - 작은수) 구하기
		// 출력예시
		// 두 수의 차는 10입니다
		System.out.println("정수입력 >> ");
		int a = sc.nextInt();
		System.out.println("정수입력 >> ");
		int b = sc.nextInt();
		String result = a>b ? Integer.toString(a) : a==b ? "같다" : b+"";
		System.out.println(result);
		//System.out.println(a>b ? a : a==b ? "같다" : b);
		int d = a>b ? a-b : b-a;
		System.out.println("두 수의 차는 " + d + "입니다");
		
		// 3. 사용자에게 나이를 입력 받아서
		// 나이가 10살 이상, 30살 이하라면 1500원
		// 그 외의 나이라면 무료 라고 출력하기
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		//System.out.println(age <= 10 && age >= 30 ? "1500원" : "무료");
		System.out.println(age < 10 || age > 30 ? "무료" : "1500원");
		
		// 4. 한 박스에 20개의 라면이 들어간다
		// 라면의 갯수를 입력 받아서
		// 필요한 박스 갯수를 출력하는 프로그램
		// 입력예시
		// 라면 갯수 >> 31
		// 출력예시
		// 필요한 상자는 2상자 입니다
		System.out.println("라면 갯수 >> ");
		int noodle = sc.nextInt();
		int box = noodle%20==0 ? noodle/20 : noodle/20 + 1;
		System.out.printf("필요한 상자는 %d상자 입니다.\n", box);
		
		char target = 'A';
		String res = target >= 'A' && target <= 'Z' ? "대문자입니다." : "대문자가 아닙니다";
		System.out.println(res);
		// 5. target에 담겨있는 문자가 대문자인지 판별하는 프로그램
		// target에 대문자가 담겨있다면 대문자입니다 출력
		// 대문자가 아니라면, 대문자가 아닙니다 출력
		// hint 아스키코드
	}
}

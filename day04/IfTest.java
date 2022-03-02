package day04;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 사용자에게 정수 한개를 입력 받아
		// 짝수라면 짝수입니다 출력하기
		// 홀수라면 홀수입니다 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int a = sc.nextInt();
		
		System.out.println(a%2==0 ? "짝수입니다" : "홀수입니다");
		
		if(a%2==0){
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
//		if(a%2==1){
//			System.out.println("홀수입니다");
//		}
		
	}
}



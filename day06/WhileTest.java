package day06;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("for문 안쪽문장");
		}
		System.out.println("for문 바깥문장");
		
		System.out.println("------------------------");
		
		int num = 0;
		while(num<3) {
			System.out.println("while문 안쪽문장");
			num++;
		}
		System.out.println("while문 바깥문장");
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("1.결제하기 2.송금하기 3.나가기");
//			int choice = sc.nextInt();
//			if(choice == 3) {
//				break; // 즉시 반복을 종료(탈출)한다
//			}
//		}
		
//		int choice = 0;
//		while(choice != 3) {
//			System.out.println("1.결제하기 2.송금하기 3.나가기");
//			choice = sc.nextInt();
//			
//		}
		
		int choice = 0;
		do{
			System.out.println("1.결제하기 2.송금하기 0.나가기");
			choice = sc.nextInt();
		}while(choice != 0);
		
		
	}
}

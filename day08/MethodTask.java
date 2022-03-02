package day08;

import java.util.Scanner;

public class MethodTask {
	//1. 사용자에게 이름과 반복횟수를 입력받아서
	// 해당 이름을 해당 횟수만큼 반복해주는 메소드 만들기
	public static void Names(int cnt, String name) {
		for(int i= 0; i < cnt ; i++) {
			System.out.println(name);
		}
	}
	
	//2. 사용자에게 나이를 입력 받아서 성인인지 미성년자인지
	// 판단하는 메소드 만들기
	
	public static boolean Ages(int age) {
		Scanner sc = new Scanner(System.in);
		if (age > 19) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//3. 배열을 배열 모습처럼 출력해주는 메소드 만들기
	public static void Arrays(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if ( i == array.length -1 ) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+", ");
			}
		}
		System.out.println("}");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {4,5};
		MethodTask.Arrays(array);
		
		int[] ar2 = {1,5,6,7,8};
		MethodTask.Arrays(ar2);
		
		
//		System.out.print("나이 입력 >>> ");
//		int age = sc.nextInt();
//		if(MethodTask.Ages(age)) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
		
		
		
		
//		System.out.print("이름 입력 >>> ");
//		String n = sc.nextLine();
//		System.out.print("횟수 입력 >>> ");
//		int c = sc.nextInt();
//		
//		MethodTask.Names(c, n);
		
	}
}

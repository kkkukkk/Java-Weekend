package day07;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		// 사용자에게 정수 5개를 입력받아 각각을 배열에 순서대로 담은 뒤 출력하라
		// 정수 입력 >>
		// 정수 입력 >>
		// 정수 입력 >>
		// 정수 입력 >>
		// 정수 입력 >>
		// {55, 10, 17, 90, 1}

		Scanner sc = new Scanner(System.in);
//		int[] ar = new int[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.print("정수입력 >>> ");
//			ar[i] = sc.nextInt();
//		}
//		System.out.print("{");
//		for (int i = 0; i < ar.length; i++) {
//			if (i == ar.length - 1) {
//				System.out.print(ar[i]);
//			} else {
//				System.out.print(ar[i] + ", ");
//			}
//		}
//		System.out.println("}");
//
//		// 해당 배열에서 가장 큰 수를 출력하시오
//		// 가장 큰 수 :
//
//		int max = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if (max < ar[i]) {
//				max = ar[i];
//			}
//		}
//		System.out.println("가장 큰 수 : " + max);
//
//		// 해당 배열에서 가장 작은 수를 출력하시오
//		// 가장 작은수 :
//
//		int min = ar[0];
//		for (int i = 0; i < ar.length; i++) {
//			if (min > ar[i]) {
//				min = ar[i];
//			}
//		}
//		System.out.println("가장 작은 수 : " + min);

		// 국어점수, 수학점수, 영어점수를 차례로 입력받아 배열에 넣어준 뒤
		// 해당 학생의 평균점수를 출력하시오

		int[] ar2 = new int[3];
		// 배열은 순서를 부여하기 위해 사용하기도 한다
		String[] subjects = { "국어", "수학", "영어" };
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(subjects[i] + " 점수 입력 >> ");
			ar2[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < ar2.length; i++) {
			total += ar2[i];
		}
		System.out.println("평균 : " + total / 3.0);

	}
}

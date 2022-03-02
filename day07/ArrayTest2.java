package day07;

import java.util.Iterator;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 자료형[] 배열명 = {값,값,....};
		int[] ar1 = { 10, 20 }; // 가장 많이 쓰이는 방식
		int[] ar2 = { 10, 20 };
		int[] ar3 = { 10, 20 };
		int ar4[] = { 10, 20 };

		// 배열의 크기만 선언하는 방법
		// 자료형[] 배열명 = new 자료형[크기];
		int[] nums = new int[5]; // int 타입이 5개 들어갈 수 있는 공간을 메모리에 할당

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]); // 0 값이 5개 들어가 있음
			// String 타입의 경우 null값이 5개 들어감 (class의 초기 값)
		}

		
		
		// 빠른 for문
		String[] names = {"김철수", "홍길동", "김영희", "박박박"};
		for(String n : names) { // names에 들어있는 요소들을 n으로 받아옴
			System.out.println(n);
		}
		System.out.println("----------------");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
	}
}

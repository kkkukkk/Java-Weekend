package day07;

public class ArrayTask {
	public static void main(String[] args) {
		int[] ar = { 1, 5, 6, 7, 10 };
		// 배열의 모양처럼 배열의 요소를 출력하기
		// 출력 예시 : {1,5,6,7,10}
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			// 만약 i가 마지막 인덱스번호라면 ", "는 출력하면 안되고
			// 마지막 인덱스가 아니라면 ", "는 출력해야한다
			if (i == ar.length - 1) {
				System.out.print(ar[i]);
			} else {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.println("}");

		// ar에서 짝수번째 인덱스에 존재하는 요소를 100으로 바꿔주기
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				ar[i] = 100;
			}
		}
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			if (i == ar.length - 1) {
				System.out.print(ar[i]);
			} else {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.print("}");
	}
}

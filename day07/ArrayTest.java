package day07;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50, 60,5,13,5,1,3,2,2,5,6,1,3,2 };
		System.out.println(ar);
//		int num = ar[0];

		//length : 배열의 요소 개수를 알려준다.
		System.out.println("배열 요소 갯수 : " + ar.length);
		
		//대입연산자 앞에 사용하면 값을 수정할 수 있다.
		ar[0] = 100;
//		ar[0] = "안녕"; int 타입의 요소가 들어있는 배열이기 때문에 오류
		
		//배열의 인덱스는 0부터 배열의 요소갯수-1
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]); 인덱스 범위를 벗어나면 오류가 발생함
		
		// 문자열 타입의 배열
		String[] ar2 = {"안녕", "반가워", "오늘은", "토요일"};
		
		System.out.println(ar2[0]);
		// ar2 속에서 오늘은 이라는 문자열이 몇번째 인덱스에 존재하는지 출력하기
		
		// 2번째 인덱스에 존재합니다!
		
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i].equals("오늘은")) {
				System.out.println(i+"번째 인덱스에 존재합니다!");
			}
		}
		
	}

}

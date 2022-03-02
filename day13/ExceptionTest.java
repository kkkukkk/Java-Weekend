package day13;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = { 10, 20, 30 };
		// 사용자에게 인덱스 번호와 정수를 입력받고,
		// 해당 인덱스 번호에 존재하는 수를 입력한 정수로 나눈 몫을 출력

		System.out.println("인덱스 : ");
		int idx = sc.nextInt();
		System.out.println("나눌 값 : ");
		int num = sc.nextInt();

		try {
			System.out.println("결과 : " + ar[idx] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외객체(e)는 발생한 예외에 대한 정보를 갖고 있다
			// 따라서 발생한 예외에 대해서 알고 싶을 때
			// 해당 객체 안에 있는 메소드를 사용할 수 있다.
			// printStackTrace() : 발생한 예외 이름을 출력하는 메소드
			// getMessage() : 발생한 예외의 부연설명을 문자열로 return 하는 메소드
			System.out.println("인덱스 번호는 0,1,2만 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("오류 발생함");
		} finally {
			System.out.println("예외가 발생 하든 안하든 무조건 실행");
		}

		System.out.println("프로그램 정상적으로 종료됨");

		
		
		
	}
}

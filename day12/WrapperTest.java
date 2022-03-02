package day12;

public class WrapperTest {
	public static void main(String[] args) {
		Integer num1 = new Integer(10); // 객체
		int num2 = 10; // 변수
		int num3 = 10;
		Integer num4 = new Integer(10);
		System.out.println(num1);
		System.out.println(num2);
		// == 연산자는 참조하는 주소를 비교한다(객체가 서로 같은지)
		System.out.println(num2 == num3);
		System.out.println(num1 == num4);
		// equals() : 객체 속에 있는 내용을 비교한다
		System.out.println(num1.equals(num4));
		
	}
}

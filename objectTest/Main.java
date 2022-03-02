package objectTest;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(2, "홍길동");
		Student s3 = new Student(1, "홍길동");
		
		System.out.println(s1.equals(s3));
		
		
		// println() 을 사용할 때 괄호 안에 클래스 타입의 객체가 있다면
		// toString()이 생략 된 것이다
		// toString()은 Object 클래스에 정의되어있고, 기본적으로
		// 패키지명.클래스명@해시코드 로 정의되어 있다
		// 따라서 출력했을 때 내가 원하는 모양으로 출력하고 싶다면
		// toString()을 오버라이딩 하면 된다
		
//		System.out.println(num1.toString());
		System.out.println(s1.toString());
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
	}
}

package day10;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("=============");
		// 자식 타입의 생성자가 호출되면 우선 부모 생성자가 먼저
		// 호출되고, 자식 생성자가 호출된다.
		SuperCar myCar = new SuperCar();

		// 인스턴스 instanceof 클래스 : 해당 인스턴스가 클래스 타입이면 true, 아니면 false
		System.out.println(momCar instanceof Car);
		System.out.println(momCar instanceof SuperCar);
		System.out.println(myCar instanceof Car);
		System.out.println(myCar instanceof SuperCar);

		momCar.name = "엄마";
		momCar.price = 100;
		momCar.color = "파란색";
//		momCar.mode = "normal";

		momCar.show();
		momCar.go();
		momCar.engineOn(); // 부모에서 정의된 메소드가 사용된다.
//		momCar.openRoof(); 자식클래스에서 새롭게 정의된 메소드는 부모클래스에서 사용불가

		System.out.println("------------------------");

		myCar.name = "홍길동";
		myCar.price = 1000;
		myCar.color = "빨간색";
		myCar.mode = "sport";

		myCar.show();
		myCar.go();
//		myCar.engineOn2();
		myCar.engineOn(); // 자식에서 재정의된 메소드가 사용된다.
		myCar.openRoof();
		System.out.println("--------------------------");
		// 업캐스팅
		// 부모 타입에 자식 값을 넣는 문법
		Car c = myCar; // 업캐스팅
		// 업캐스팅 된 경우 자식에서 새롭게 정의된 멤버는 사용이 불가능하다

//		c.mode = "normal";
		c.go();
//		c.openRoof();
		c.engineOn(); // 만일 자식에서 재정의 된 메소드가 있다면 사용이 가능하다.
		// 재정의된 대로 동작한다

//		SuperCar sc = momCar; momCar가 SuperCar 타입이 아니므로  불가능
		// 부모타입의 객체는 자식타입이 아니기 때문에 자식타입으로 넣어줄 수 없다
		// 다운캐스팅 : 자식이었는데 업캐스팅 된 객체를 다시 자식으로 돌려놓을때
		
		SuperCar s = (SuperCar)c;
		
		s.openRoof();
		
		//(int)3.14
//		int a = (int)3.14;
//		double b = 3;
		
		
		
		

	}
}

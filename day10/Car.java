package day10;

public class Car {
	String name;
	int price;
	String color;
	
	public Car() {
		System.out.println("Car 객체 생성됨");
	}
	
	public void go() {
		System.out.println("앞으로 갑니다.");	
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다.");
	}
	
	public void show() {
		System.out.println("----차량정보----");
		System.out.println("차주 : " + this.name);
		System.out.println("가격 : " + this.price +"만원");
		System.out.println("색상 : " + this.color);
	}
	
}

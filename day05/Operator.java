package day05;

public class Operator {
	public static void main(String[] args) {
		int num = 10;
		//++num;
		// 전위형은 우선순위가 매우 빠르다
		// 후위형은 우선순위가 매우 느리다(대입연산자보다도 느리다)
		System.out.println(++num); //num에 1더한값을 대입한 후 출력됨
	//	System.out.println(num++); //출력하고 num에 1더한값을 대입함
		
		System.out.println(num);
		
		System.out.println("-----------------");
		int a = 100;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
	}
}

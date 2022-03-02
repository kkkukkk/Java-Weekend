package day12;

public class BoxingUnboxing {
	public static void main(String[] args) {
		int i = 10;
		// boxing
		Integer wi = new Integer(i);
		// unboxing
		int ri = wi.intValue();
		
		double d = 3.14;
		// boxing
		Double wd = new Double(d);
		// unboxing
		double rd = wd.doubleValue();
		
		
		// 5버전 이후로 auto boxing 과 auto unboxing을 지원한다
		
		int num1 = 10;
		Integer num2 = new Integer(10);
		// num1이 오토 박싱 된 수에 Object 타입으로 업캐스팅
		System.out.println(num2.equals(num1));
		System.out.println(num1 == num2);
		
		// auto unboxing
		int num3 = new Integer(10);
		// auto boxing
		Integer num4 = 10;
		
		
				
	}
}

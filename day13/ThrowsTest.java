package day13;

public class ThrowsTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		try {
			a.rest();
		} catch (InterruptedException e) {
			System.out.println("30초 뒤에 다시 시도하세요");
		}
	}
}

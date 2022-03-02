package day13;

public class Animal {
	public void rest() throws InterruptedException,
	ArrayIndexOutOfBoundsException, ArithmeticException{
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
		}
	}
}

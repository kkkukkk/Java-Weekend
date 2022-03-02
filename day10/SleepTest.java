package day10;

public class SleepTest {
	public static void main(String[] args) {
		// 몇 초 동안 실행을 멈춰주는 메소드
		// Thread 클래스 안에 존재하는 sleep(), 스태틱 메소드 
		System.out.print("시작");
		for(int i = 0; i<5 ; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("오류가 발생했을 때 실행되는 영역");
			}
			
		}
		System.out.println("종료");
	}
}

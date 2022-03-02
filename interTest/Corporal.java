package interTest;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("상등병이 밥을 먹습니다");
	}
	
	@Override
	public void work() {
		System.out.println("상등병이 일을 합니다");
	}
	
	@Override
	public void sleep() {
		System.out.println("상등병이 잠을 잡니다");
	}
	

}

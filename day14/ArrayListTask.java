package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 회원 1명에 대한 4개의 값(이름,나이,아이디,비밀번호)은
		// User 타입의 객체에 담아준다.

		// 여러개의 User 타입의 객체는 ArrayList에 저장하겠다.
		ArrayList<User> list = new ArrayList<User>(); // 회원정보가 저장된 리스트

		while (true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보보기");
			System.out.println("4.나가기");
			
			System.out.print("번호선택 >> ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 4) {
				break;
			} else if (choice == 1) {

				boolean check = false; // flag 변수

				System.out.print("이름 입력 >> ");
				String name = sc.nextLine();

				System.out.print("나이 입력 >> ");
				int age = Integer.parseInt(sc.nextLine());

				System.out.print("id 입력 >> ");
				String id = sc.nextLine();

				for (User user : list) {
					if (user.id.equals(id)) {
						// id가 중복된다는 의미
						check = true;
						break;
					}
				}


				if (check == false) {
					User u = new User(); // 회원 1명에 대한 정보를 저장할 객체
					
					u.name = name;
					u.age = age;
					u.id = id;
					
					System.out.print("pw 입력 >> ");
					u.pw = sc.nextLine();

					list.add(u);
					System.out.println("회원가입 성공");
				} else {
					System.out.println("중복된 아이디가 존재합니다");
				}

			} else if (choice == 2) { // 로그인
				boolean check = false;
				
				// 아이디와 비밀번호를 입력 받고
				System.out.print("id >> ");
				String id = sc.nextLine();
				System.out.print("pw >> ");
				String pw = sc.nextLine();
				
				// 회원가입된 정보가 입력받은 아이디와 비밀번호와 일치한다면
				for (User u : list) {
					if(u.id.equals(id) && u.pw.equals(pw)) {
						System.out.println(u.name+"님 환영합니다 로그인 되었습니다");
						check = true;
						break;
					}
				}
				
				if(check == false) {					
					System.out.println("로그인 실패");
				}
				// 000님 환영합니다 로그인 되었습니다.(로그인 성공)
				// 그게 아니라면 비밀번호와 아이디를 확인해주세요 출력(로그인 실패)

			} else if (choice == 3) {
				System.out.println(" id >> ");
				String id = sc.nextLine();
				boolean check = false;
				for (User user : list) {
					if(user.id.equals(id)) {
						check = true;
						System.out.println("---회원정보---");
						System.out.println("이름: " + user.name);
						System.out.println("나이: " + user.age);
						System.out.println("id: " + user.id);
						System.out.println("pw: " + user.pw);
						break;
					}	
				}
				if(check == false) { 
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
				
			} else {
				System.out.println("잘못 입력했습니다");
			}

		}
	}
}

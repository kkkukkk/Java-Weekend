package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.MovieDAO;
import dto.MovieDTO;

public class View { // View 개발자 철수
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
		
		
		while(true) {
			System.out.println("1.영화추가하기");
			System.out.println("2.영화수정하기");
			System.out.println("3.영화삭제하기");
			System.out.println("4.영화검색하기");
			System.out.println("5.모든영화보기");
			System.out.println("6.종료하기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 6) {
				break;
			}else if(choice == 1) {
				MovieDTO dto = new MovieDTO();
				System.out.print("순위 >> ");
				dto.rank = Integer.parseInt(sc.nextLine());
				
				System.out.print("제목 >> ");
				dto.title = sc.nextLine();
				System.out.print("개봉일 >> ");
				dto.date = sc.nextLine();
				System.out.print("총수익 >> ");
				dto.revenue = sc.nextLine();
				System.out.print("관객수 >> ");
				dto.view = sc.nextLine();
				System.out.print("스크린 >> ");
				dto.screen = sc.nextLine();
				
				if(dao.add(dto)) {
					System.out.println("추가 성공!");
				}else {
					System.out.println("순위를 다시 확인하세요!");
				}
				
			}else if(choice == 2) {
				// 영화 랭킹으로 영화 제목을 수정하기
				// 수정할 영화 랭킹을 입력 받는다
				System.out.print("랭킹 입력 >> ");
				int rank = Integer.parseInt(sc.nextLine());
				
				// 변경할 영화 제목을 입력 받는다
				System.out.print("수정 제목 >> ");
				String title = sc.nextLine();
				
				if(dao.update(rank, title)) {
					System.out.println("수정 성공!");
				}else {
					System.out.println("존재하지 않는 랭킹입니다");
				}
				
			}else if(choice == 3) {	
				System.out.print("랭킹 입력 >> ");
				int rank = Integer.parseInt(sc.nextLine());
				
				if(dao.remove(rank)) {
					System.out.println("수정 성공~!");
				}else {
					System.out.println("해당랭킹이 존재하지 않습니다");
				}
				
				
				
			}else if(choice == 4) {
				System.out.print("제목 입력 >> ");
				String title = sc.nextLine();
				System.out.println("---검색결과---");
				for(MovieDTO dto : dao.select(title)){
					System.out.println("|["+dto.rank+"위]-"+dto.title+"----");
					System.out.println("|개봉일:"+ dto.date);
					System.out.println("|관객수:"+ dto.view);
					System.out.println("|총수익:"+ dto.revenue);
					System.out.println("|스크린:"+ dto.screen);
					System.out.println();					
				}
				
				
				
			}else if(choice == 5) {
				ArrayList<MovieDTO> list = dao.selectAll();
				
				for(MovieDTO dto : list) {
					System.out.println("|["+dto.rank+"위]-"+dto.title+"----");
					System.out.println("|개봉일:"+ dto.date);
					System.out.println("|관객수:"+ dto.view);
					System.out.println("|총수익:"+ dto.revenue);
					System.out.println("|스크린:"+ dto.screen);
					System.out.println();
				}
				
			}else {
				System.out.println("잘못 입력했습니다");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

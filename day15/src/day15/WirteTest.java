package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WirteTest {
	public static void main(String[] args) {
		//1. 파일 객체 만들기
		// 생성자 안에는 내가 사용할 파일의 경로를 써준다
		//"D:\\1400_java_bsy\\memo\\test.txt" : 절대경로
		//"test.txt" : 상대경로, 프로젝트 폴더로 기본위치가 설정되어있다
					// D:\\1400_java_bsy\\workspace\\day15
					// .. : 상위 폴더를 의미한다
		
//		File f = new File("D:\\1400_java_bsy\\memo\\test.txt");
		File f = new File("..\\..\\memo\\test2.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//2. 스트림 열기
			// 생성자에는 사용할 파일 객체를 써준다
			// 생성자에 true값을 넘기면 기존 내용 뒤쪽에 덧붙이기
			// false나 생략이라면 기존 내용 전체를 덮어쓰기한다
			fw = new FileWriter(f);
			//3. 버퍼만들기
			// 생성자에는 FileWriter 객체를 써준다
			bw = new BufferedWriter(fw);
			
			//4. 파일 출력
			bw.write("계속해서 수정중\n");
//			bw.newLine();
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//5. 버퍼닫기
				if(bw != null) bw.close();
				//6. 스트림 닫기
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
			
			
		}
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

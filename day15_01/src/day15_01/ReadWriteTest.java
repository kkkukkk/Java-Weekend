package day15_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteTest {
	
	//??
	public static void add(String msg) throws IOException{
		// 파일 출력
		File f = new File("task.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(msg+"\n");
		
		bw.close();
		fw.close();
		
	}
	
	public static void add(int num, String msg) throws IOException{
		File f = new File("task.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String contents = "";
		for (int i = 0; i < num; i++) {
			contents += br.readLine() + "\n";
		}
		contents += msg + "\n";
		
		String line;
		while((line = br.readLine()) != null) {
			contents += line + "\n";
		}
		
		
		br.close();
		fr.close();
		
//		System.out.println(contents);
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(contents);
		
		bw.close();
		fw.close();
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.덧붙이기");
			System.out.println("2.삽입하기");
			System.out.println("3.종료");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				System.out.println("메모장에 입력하고싶은 문장을 쓰세요");
				String msg = sc.nextLine();
				
				// msg에 적혀있는 문장이 task.txt 마지막줄에 추가된다
				try {
					ReadWriteTest.add(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(choice == 2) {
				System.out.print("삽입위치 : ");
				int num = Integer.parseInt(sc.nextLine());
				
				System.out.print("삽입내용 : ");
				String msg = sc.nextLine();
				
				// num번째 줄에 msg가 삽입되는 메소드
				try {
					ReadWriteTest.add(num, msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(choice == 3) {
				break;
			}else{
				System.out.println("다시입력하시오");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

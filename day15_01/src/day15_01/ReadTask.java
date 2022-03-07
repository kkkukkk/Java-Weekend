package day15_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTask {
	public static void main(String[] args) {
		// 사용자에게 정수를 입력 받아서
		// task.txt파일에서 해당 정수번째에 있는 줄을 출력하라
		// 입력 >> 5
		// 5번째줄입니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		sc.close();
		
		File f = new File("task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		
		
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			// 사용자가 입력한 정수는 num에 들어있다
			for(int i = 0; i < num; i++) {
				br.readLine();
			}
			
			System.out.println(br.readLine());		
			
			
			
		}catch(IOException e) {
			
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package day15_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) {
		// 1. 파일 객체 만들기
		// 파일 경로가 없다면 FileNotFoundException이 발생한다
		File f = new File("D:\\1400_java_bsy\\memo\\day01.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 2. 스트림열기
			fr = new FileReader(f);

			// 3. 버퍼 만들기
			br = new BufferedReader(fr);

			// 4. 파일 읽기
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());

			for(String line = br.readLine(); line != null; line = br.readLine()) {
				System.out.println(line);
			}
			
//			String line = "";
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
			
//			String line = br.readLine();
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 5. 버퍼닫기
				if (br != null) br.close();
				// 6. 스트림 닫기
				if (fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		
		
		
		
	}
}

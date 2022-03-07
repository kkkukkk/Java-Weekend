package day15_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {
	public static void main(String[] args) {
		// day15_01 프로젝트 폴더에 task.txt 파일에다
		// 0번째줄입니다
		// 1번째줄입니다
		// 2번째줄입니다
		// ...
		// 9번째줄입니다
		// 출력하기
		File f = new File("task.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for (int i = 0; i < 10; i++) {
				bw.write(i + "번째줄입니다\n");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

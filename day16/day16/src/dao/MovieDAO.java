package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dto.MovieDTO;

public class MovieDAO {
	// 랭킹을 입력받아 삭제하는 메소드
	public boolean remove(int rank) throws IOException{
		if(rank < 1 || rank > getLastRank()) {
			return false;
		}
		
		BufferedReader br = DBConnection.read();
		int ranking = 0; // 수정된 순위를 저장할 변수
		String contents = "";
		for (int i = 0; i < rank-1; i++) {
			ranking++;
			contents += br.readLine() + "\n";
		}
		br.readLine();
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
//			ranking++;
			contents += ++ranking + line.substring(line.indexOf("\t")) + "\n";
		}
		
		br.close();
		
//		System.out.println(contents);
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		
		bw.close();
		
		
		
		return true;
	}
	
	
	// 해당 랭킹의 영화 제목을 입력받은 제목으로 바꾼다
	// update() 랭킹과 제목을 입력받아 데이터베이스를 수정하는 메소드
	public boolean update(int rank, String title) throws IOException {
		if(rank < 1 || rank > getLastRank()) {
			return false;
		}
		
		BufferedReader br = DBConnection.read();
		
		String contents = "";
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			String[] temp = line.split("\t");
			
			if(temp[0].equals(rank + "")) {
				temp[1] = title;
				contents += String.join("\t", temp) + "\n";
				continue;
			}
			contents += line +"\n";
//			contents += String.join("\t", temp) + "\n";
			
		}
		
		br.close();
		
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		
		bw.close();
		
		
		
		return true;
	}
	
	
	
	private int getLastRank() throws IOException{
		BufferedReader br = DBConnection.read();
		int rank = 0;
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			rank++;
		}
		
		br.close();
		return rank;
	}
	
	//영화 정보를 추가하는 메소드
	public boolean add(MovieDTO dto) throws IOException{
		//추가하고자 하는 순위가 잘 입력된 순위인지 파악해야한다
		if(dto.rank < 1 || dto.rank > getLastRank()+1) {
			return false;
		}
		
		
		BufferedReader br = DBConnection.read();
		String contents = "";
		for(int i = 0; i < dto.rank - 1; i++) {
			contents += br.readLine() + "\n";
		}
		contents += String.format("%d\t%s\t%s\t%s\t%s\t%s\n", 
				dto.rank,dto.title,dto.date,dto.revenue,dto.view,dto.screen);
		
//		contents += dto.rank+ "\t" + dto.title+ "\t" +dto.date+ "\t" +
//				dto.revenue+ "\t" + dto.view+ "\t" +dto.screen + "\n";
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			String[] temp = line.split("\t");
			temp[0] = Integer.parseInt(temp[0]) + 1 + "";
			contents += String.join("\t", temp) + "\n";
			
		}
		
		br.close();
		
//		System.out.println(contents);
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		
		bw.close();
		
		return true;
	}
	
	
	//제목으로 영화 정보를 검색하는 메소드
	public ArrayList<MovieDTO> select(String title) throws IOException{
		
		BufferedReader br = DBConnection.read();
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			String[] temp = line.split("\t");
			if(temp[1].contains(title)) {
				MovieDTO dto = new MovieDTO();
				dto.rank = Integer.parseInt(temp[0]);
				dto.title = temp[1];
				dto.revenue = temp[3];
				dto.date = temp[2];
				dto.view = temp[4];
				dto.screen = temp[5];
				list.add(dto);
			}
		}
		
		
		br.close();
		return list;
	}
	
	
	
	// 데이터 베이스에 존재하는 모든 영화 데이터를 가져오는 메소드
	public ArrayList<MovieDTO> selectAll() throws IOException{
//		File f = new File("movie.txt");
//		FileReader fr = new FileReader(f);
//		BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = DBConnection.read();
		
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		
		String line;
		while((line = br.readLine()) != null) {
//			System.out.println(line);
			// line: "1\t명량\t2014-07-30\t135,748,398,910\t17,613,682\t1,587"
			// {"1","명량","2014-07-30","135,748,398,910","17,613,682","1,587"}
			String[] temp = line.split("\t"); 
			
			MovieDTO dto = new MovieDTO();
			dto.rank = Integer.parseInt(temp[0]);
			dto.title = temp[1];
			dto.date = temp[2];
			dto.revenue = temp[3];
			dto.view = temp[4];
			dto.screen = temp[5];
			list.add(dto);
			
		}
		
		br.close();
//		fr.close();
			
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

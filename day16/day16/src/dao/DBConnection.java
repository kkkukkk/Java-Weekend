package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	public static BufferedWriter write() throws IOException{
		return new BufferedWriter(new FileWriter("movie.txt"));
	}
	
	public static BufferedReader read() throws IOException{
//		File f = new File("movie.txt");
//		FileReader fr = new FileReader("movie.txt");
		BufferedReader br = new BufferedReader(new FileReader("movie.txt"));
		return br;
	}
}









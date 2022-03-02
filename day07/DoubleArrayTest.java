package day07;

public class DoubleArrayTest {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2},
				{10,20},
				{100,200}
			};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("i: "+i+" j:"+j);
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("--------------------");
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[2][0]);
		
		
		
		int[][] scores = {{10,80,70}, {70,80,100}};
		
		int [][] arr2 = new int [2][3];
		
		
		
		
		
		
		
	}
}

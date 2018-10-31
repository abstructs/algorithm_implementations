package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class ZeroMatrix {
	
	public static void main(String args[]) {
		int[][] arr1 = createMatrix(3, 4);
		int[][] arr2 = createMatrix(4, 3);
		int[][] arr3 = createMatrix(5, 5);
		arr1[0][0] = 0;
		
		arr2[3][0] = 0;
		arr2[3][2] = 0;
		
		arr3[2][1] = 0;
		
		
		
		System.out.println("\nOriginal");
		printArr(arr1);
		
		System.out.println("\nZeros Set");
		
		setZeros(arr1);
		printArr(arr1);
		
		System.out.println("\nOriginal");
		printArr(arr2);
		
		System.out.println("\nZeros Set");
		
		setZeros(arr2);
		printArr(arr2);
		
		System.out.println("\nOriginal");
		printArr(arr3);
		
		System.out.println("\nZeros Set");
		
		setZeros(arr3);
		printArr(arr3);
		
	}
	
	public static void setZeros(int[][] arr) {
		Map<Integer, Boolean> zeroRows = new HashMap<Integer, Boolean>();
		Map<Integer, Boolean> zeroCols= new HashMap<Integer, Boolean>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					zeroRows.put(i, true);
					zeroCols.put(j, true);
				}
			}
		}
		
		for(int row : zeroRows.keySet()) 
			for(int col = 0; col < arr[row].length; col++) 
				arr[row][col] = 0;
			
		
		
		for(int col : zeroCols.keySet()) {
			for(int row = 0; row < arr.length; row++) {
				arr[row][col] = 0;
			}
		}
	}
	
	public static int[][] createMatrix(int N, int M) {
		int[][] arr = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = i * N + j + 1;
			}
		}
		
		return arr;
	}
	
	public static void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println();
			System.out.print("| ");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(zeroPad(arr[i][j], 2) + " ");
			}
				
			System.out.println("|");

		}
	}
	
	private static String zeroPad(int num, int pad) {
		StringBuilder builder = new StringBuilder();
		
		
		for(int i = pad -  String.valueOf(num).length(); i > 0; i--) {
			builder.append("0");
		}
		
		builder.append(num);
		
		return builder.toString();
	}
}

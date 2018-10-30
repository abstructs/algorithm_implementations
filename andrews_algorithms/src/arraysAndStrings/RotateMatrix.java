package arraysAndStrings;

public class RotateMatrix {
	public static void main(String args[]) {
		Integer[][] arr1 = createMatrix(1);
		Integer[][] arr2 = createMatrix(2);
		Integer[][] arr3 = createMatrix(3);
		Integer[][] arr4 = createMatrix(6);
		System.out.println("\nOriginal:");
		printArr(arr1);
		
		System.out.println("\nRotated:");
		rotate(arr1);
		
		printArr(arr1);
		
		System.out.println("\nOriginal:");
		printArr(arr2);
		
		System.out.println("\nRotated:");
		rotate(arr2);
		
		printArr(arr2);
		
		System.out.println("\nOriginal:");
		printArr(arr3);
		
		System.out.println("\nRotated:");
		rotate(arr3);
		
		printArr(arr3);
		
		System.out.println("\nOriginal:");
		printArr(arr4);
		
		System.out.println("\nRotated:");
		rotate(arr4);
		
		printArr(arr4);
	}
	
	public static Integer[][] createMatrix(int N) {
		Integer[][] arr = new Integer[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = i * N + j + 1;
			}
		}
		
		return arr;
	}
	
	private static String zeroPad(int num, int pad) {
		StringBuilder builder = new StringBuilder();
		
		
		for(int i = pad -  String.valueOf(num).length(); i > 0; i--) {
			builder.append("0");
		}
		
		builder.append(num);
		
		return builder.toString();
	}
	
	public static void printArr(Integer[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println();
			System.out.print("| ");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(zeroPad(arr[i][j], 2) + " ");
			}
				
			System.out.println("|");

		}
	}
	
	public static void rotate(Integer[][] arr) {
		int n = arr.length;
		for(int i = 0; i < n / 2; i++) {
			rotateLayer(arr, i);
		}
	}
	
	public static void rotateLayer(Integer[][] arr, int layer) {
		int n = arr.length;
		
		for(int iter1 = layer; iter1 < n - 1 - layer; iter1++) {
			int i = layer;
			int j = iter1;
			Integer temp1 = arr[i][j];
			for(int iter2 = 0; iter2 < 4; iter2++) {
				int nextI = j;
				int nextJ = (n - 1) - i;
				Integer temp2 = arr[nextI][nextJ];
				arr[nextI][nextJ] = temp1;
				
				temp1 = temp2;
				i = nextI;
				j = nextJ;
				
			}
		}
	}
}

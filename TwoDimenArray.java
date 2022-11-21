package java_LJH_instance_example;

public class TwoDimenArray {
	public static void arrayPractice1() {
		int arr[][] = new int[4][4];	// 4*4짜리 2차원 배열 생성
		int num = 1;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num++;
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	// 16부터 1까지 역순으로 
	public static void arrayPractice2() {
		int arr[][] = new int[4][4];
		int num = 16;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = num--;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		arrayPractice1();
		System.out.println();
		arrayPractice2();
	}
}

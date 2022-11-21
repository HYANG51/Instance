package java_LJH_instance_example;

public class RandomArray {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int num = 1;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = (int)(Math.random()*10)+1;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}

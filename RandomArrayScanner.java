package java_LJH_instance_example;

import java.util.Scanner;

public class RandomArrayScanner {
	public static void main(String[] args) {
		
		int row,col;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		row = scanner.nextInt();
		
		System.out.println("열 크기 : ");
		col = scanner.nextInt();
		
		char[][] arr = new char[row][col];
		
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {
				arr[row][col] = (char)((Math.random()*26)+65);		
				// 65번(A)부터 시작해서 알파벳 끝까지. (알파벳은 총 26글자) 
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}

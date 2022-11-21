package java_LJH_instance_example;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);

		word = scanner.next();

		for(int i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}

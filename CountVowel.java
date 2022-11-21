package java_LJH_instance_example;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		int consonant = 0;
		int vowel = 0;
		String word;
		
		Scanner sc = new Scanner(System.in);
		// word = sc.next();	띄어쓰기 하면 못읽어잉
		word = sc.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;

			default:
				consonant++;
				break;
			}
		}
		
		System.out.println("총 글자 수는 : " + word.length() + "개 입니다.");
		System.out.println("모음은 : " + vowel + "개 입니다.");
		System.out.println("자음은 : " + consonant + "개 입니다.");
	}
}

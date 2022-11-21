package java_LJH_instance_example;

public class SubString {
	public static void main(String[] args) {
		// substring -> 글자 자르기
		String str = "abcdefg";
		System.out.println(str.substring(2));	// 인덱스 2 이후의 내용으로 이뤄진 문자열 "cdefg"반환
		System.out.println(str.substring(2, 4));	// 인덱스 2~3에 위치한 내용의 문자열 반환
	}
}

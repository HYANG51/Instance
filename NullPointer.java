package java_LJH_instance_example;

public class NullPointer {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);	// null 출력
		int len = str.length();		// Exception
	}
}

package java_LJH_instance_example;

public class Hello {
	public static void main(String[] args) {
		String word= "Hello.java";
		
		int index = word.indexOf(".");	// .의 위치를 찾음
		System.out.println(index);		// .의 위치를 출력함 (5 출력)
		
		String fileName = word.substring(0,index);
		System.out.println(fileName);
		
		String extention = word.substring(index+1);
		System.out.println(extention);
	}
}

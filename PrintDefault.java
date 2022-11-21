package java_LJH_instance_example;
interface Printable2{
	void print(String doc);
	default void printCMYK (String doc) {
		System.out.println("프린트");
	}
}

class Prn909Drv implements Printable2 {
	public void print(String doc) {
		System.out.println("블랙 지원");
	}
	
	public void printCMYK(String doc) {
		System.out.println("컬러 지원");
	}
}
// 삼성 제조사
class SPrinterDriver2 implements Printable2{
	@Override
	public void print(String doc) {
		printCMYK("프린트");
		
		System.out.println("삼성드라이버");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("함수 오버라이딩 적용됨.");
	}
}
public class PrintDefault {
	public static void main(String[] args) {
		String str = "내가 제일 잘나가";
		
		Printable2 pr1 = new Prn909Drv();
		pr1.printCMYK(str);
	}
}

package java_LJH_instance_example;
// 기본적으로 함수선언(추상 함수)과 상수가 올 수 있다.
// abstract = interface = 자손이 구현(implements)하라.
interface Printable{
	public final double PI = 3.14;
	public abstract void print(String doc);
}
class Printer implements Printablee{
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}
public class InterfaceMain {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print("내가 제일 잘나가");
		
		Printablee printable = new Printer();
		printable.print("니가 제일 잘나가");
	}
}

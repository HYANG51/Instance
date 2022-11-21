package java_LJH_instance_example;

class NumberPrinter {
	private int myNum = 0;
	private static int staticMyNum = 0;
	
	// static 함수에 인스턴스 라면(변수,함수)가 올 수 없는 이유?
	static void showInt(int n) {
		//System.out.println(myNum);
		System.out.println(n);
	}
	
	void printInt() {
		System.out.println(myNum);
	}
	
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	
	void showMyNumber() {
		showInt(myNum);
	}
}
public class ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);
		
		np.setMyNumber(75);
		np.showMyNumber();
		
	}
}

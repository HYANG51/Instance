package java_LJH_instance_example;

public class WrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Integer iInst = new Integer(3);
		showData(iInst);
		showData(new Double(7.15));
	}
}

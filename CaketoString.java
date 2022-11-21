package java_LJH_instance_example;
class Cake3{
	
	// Object 클래스의 toString 메소드를 오버라이딩
	public String toString() {
		return "My birthday cake";
	}
}

class CheeseCake3 extends Cake3{
	
	// Cake 클래스의 toString 메소드를 오버라이딩
	public String toString() {
		return "My birthday cheese cake";
	}
}
public class CaketoString {
	public static void main(String[] args) {
		Cake3 cake = new Cake3();
		System.out.println(cake);
	}
}

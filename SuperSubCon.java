package java_LJH_instance_example;
class SuperCLS{
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}
public class SuperSubCon {
	public static void main(String[] args) {
		new SubCLS();
	}
}

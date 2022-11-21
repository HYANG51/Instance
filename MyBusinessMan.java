package java_LJH_instance_example;
class Man {
	String name;
	
	public Man() {}		
	// 디폴트 생성자
	
	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

// this 생성
// 부모꺼를 메모리에 올릴 때 소스코드상에서 표현 되어야 하는 것 

class BusinessMan extends Man{
	String company;
	String position;

		public BusinessMan(String company, String position) {		
		
		this.company = company;
		this.position = position;
	}

	//	public BussinessMan(String name, String company, String position) {
	//		this.name = name;
	//		this.company = company;
	//		this.position = position;
	//	}

	public void tellYourInfo() {
		System.out.println("My company is " + this.company);
		System.out.println("My position is " + this.position);
		tellYourName();
	}
}
public class MyBusinessMan {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("Hybrid ELD","Staff Eng.");

		man.tellYourInfo();
	}
}

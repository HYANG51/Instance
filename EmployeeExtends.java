package java_LJH_instance_example;
// 클래스 : Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
// 필드 : 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
// 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
// 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
class Employee {
	String name;
	int age;
	String addr;	// 주소
	String dept;	// 
	int salary;
	
	public Employee(String name, int age, String addr, String dept) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + dept);
	}
}
class Regular extends Employee{
	public Regular(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);
	}
	
	public void setSalary(int salary){
		super.salary = salary;
	}
	public void printInfo() {
		super.printInfo();
		
		System.out.println("정규직");
		System.out.println("월급 : " + super.salary);
	}
}

class Temporary extends Employee{
	int workHour;
	//int timepay = 10000;
	int timePay;
	//public Temporary() {
	//	timePay = 10000;
	//}
	public Temporary(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);
		timePay = 10000;
	}
	public void setWorkHours(int workHour) {
		this.workHour = workHour;		// 일 한 시간을지정하면서
		this.salary = workHour * this.timePay;		
		// 일 한 시간 * 시간당 보수로 계산하여 저장.
		// this.timePay로 써도 되고 그냥 timePay로 써도 되고.
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("비정규직");
		System.out.println("일한시간" + workHour);
		System.out.println("급여" + salary);
	}
}
public class EmployeeExtends {
	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
		System.out.println();
		
		
		Regular kim = new Regular("김길동", 19, "서울 뉴욕시", "개발 1팀");
		kim.setSalary(10000);
		kim.printInfo();
		System.out.println();
		
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		t.setWorkHours(120);
		t.printInfo();
	}
}

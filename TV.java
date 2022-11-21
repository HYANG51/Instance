package java_LJH_instance_example;

public class TV {

	/*String company;
	int year;
	int inch;

	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}*/
	// 센세 코드
	
	private String brand;
	private int year;
	private int inch;
	
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

package java_LJH_instance_example;

public class CircleClassArr {
	private int radius;

	public CircleClassArr(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	public static double sumCircles(CircleClassArr[] circles) {

		double area = 0;

		for (CircleClassArr circle : circles) {
			area = area + circle.getArea();
		}
		return area;
	}

	public static void main(String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
		}

		// Circle[] arrCircle = new Circle[2];
		// arrCircle[0] = new Circle(10);
		// arrCircle[1] = new Circle(20);
		// 아래의 한줄짜리 코드랑 동일한 내용.

		CircleClassArr[] arrCircle = {new CircleClassArr(10), new CircleClassArr(20)};	

		double sumArea = sumCircles(arrCircle);
		System.out.println(sumArea);
	}
}

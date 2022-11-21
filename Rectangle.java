package java_LJH_instance_example;

public class Rectangle {
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}


	public int getArea() {
		return width * height;
	}
	public static void main(String[] args) {

		Circle circle = new Circle(10);
		System.out.println(circle.getArea());

		Rectangle rec = new Rectangle(10,20);
		System.out.println(rec.getArea());

	}
}
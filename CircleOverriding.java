package java_LJH_instance_example;
class Shape{
	public double getArea() {
		return 0.0;
	}
}
class Circle3 extends Shape{
	private int r;

	public Circle3(int r) {
		this.r=r;
	}
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}

	@Override
	public String toString() {
		//return "넓이는 " + (r * r * Math.PI) + "입니다.";
		return "넓이는 " + getArea() + "입니다.";
	}
}

class Triangle extends Shape{
	private int width, height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height / 2.0;
	}
}

class Rectangle2 extends Shape{
	private int width, height;

	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height;
	}
}


public class CircleOverriding {
	
	static double getArea(Circle3 circle) {
		return circle.getArea();
	}
	static double getArea(Triangle triangle) {
		return triangle.getArea();
	}
	static double getArea(Rectangle2 rectangle) {
		return rectangle.getArea();
	}
	
	// 위에 세개 만들어야될거 이거로 하면 하나로 해결됨 :3c
	// 폴리몰피즘(다형성) 이용해서 글케 되는거래. 뭔소리야 ㅅㅂ..
	static double getArea(Shape shape) {
		return shape.getArea();
	}
	
	public static void main(String[] args) {
		
		double sumArea = 0;
		
		Circle3 circle = new Circle3(10);
		Triangle triangle = new Triangle(10,10);
		Rectangle2 rectangle = new Rectangle2(10, 10);
		
		sumArea = circle.getArea() + triangle.getArea() + rectangle.getArea();
		
		System.out.println("고객님 넓이는 " + sumArea + "입니다.");
		
		Circle3 circle2 = new Circle3(10);
		System.out.println(circle2);

		// 위와 동일한 출력값.
		// 근데 내용 추가되거나 하면 위보단 아래가 수정하기 더 간편하고 보기 좋으니까 아래를 추천.
		
		sumArea = 0;
		
		Shape[] shape = {new Circle3(10), new Triangle(10,10), new Rectangle2(10, 10)};
		
		for (Shape s : shape) {
			sumArea += s.getArea();
		}
		
		System.out.println("고객님 넓이는 " + sumArea + "입니다.");
	}
}

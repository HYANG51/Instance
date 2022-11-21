package java_LJH_instance_example;

public class Circle {
	int radius;
	
	Circle(int num){
		radius = num;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}

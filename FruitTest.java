package java_LJH_instance_example;
interface Fruit{
	void print();
}

class Grape implements Fruit{
	@Override
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Aapple implements Fruit{
	@Override
	public void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear implements Fruit{
	@Override
	public void print() {
		System.out.println("나는 배이다.");
	}
}
public class FruitTest {
	public static void main(String[] args) {
		Fruit fAry[] = {new Grape(), new Aapple(), new Pear()};
		for(Fruit f : fAry)
			f.print();

		/*- 결과
		나는 포도이다.
		나는 사과이다.
		나는 배이다.*/
	}
}

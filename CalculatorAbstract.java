package java_LJH_instance_example;

abstract class ACalculator{
	protected int num1,num2;

	public ACalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;   
	}
	public abstract int add();
}

class AbstractCalculator extends ACalculator{

	public AbstractCalculator(int num1, int num2) {
		super(num1, num2);      
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
}

public class CalculatorAbstract {
	public static void main(String[] args) {

		AbstractCalculator abstractCalculator = new AbstractCalculator(1, 1);
		System.out.println(abstractCalculator.add());   
		
	}
}

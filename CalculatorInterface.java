package java_LJH_instance_example;

// 클래스보다 인터페이스가 좋은 이유
// 1. 클래스로 상속을 이용하게 되면 불필요한 함수들도 같이 상속받게됨.
// 2. 다중 상속을 활용하여, 피룡한 기능만 넣을 수 있다.
// 3. 불필요한 더미를 만들 필요가 없다.
// 4. 업무의 효율성을 기할 수 있다.

interface ICalculator{
	public static final int COUNT = 3;
	
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int multi(int num1, int num2);
	int div(int num1, int num2);    
}

class Calculator implements ICalculator{
	public static final int COUNT = 3;
	
	@Override
	public int add(int num1, int num2){
		return num1 + num2;
	}
	@Override
	public int sub(int num1, int num2){
		return num1 - num2;
	}
	@Override
	public int multi(int num1, int num2){
		return num1 * num2;
	}
	@Override
	public int div(int num1, int num2){
		return num1 / num2;
	}
}
class CalculatorInterface {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println(calculator.add(3,  5));
		System.out.println(calculator.sub(3,  5));
		System.out.println(calculator.multi(3,  5));
		System.out.println(calculator.div(3,  5));

	}
}

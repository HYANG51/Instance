package java_LJH_instance_example;

public class GetSum {
	int num;

	public GetSum(int num) {
		this.num = num;
	}
	public int getSum() {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}

}
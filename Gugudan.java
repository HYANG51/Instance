package java_LJH_instance_example;

public class Gugudan {
	int num;
	
	public void printGugu(int num) {
		for(int i = 2; i <= num; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}

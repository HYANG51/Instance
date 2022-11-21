package java_LJH_instance_example;

public class StarPrint {
	int num;
	
	public StarPrint(int num) {
		this.num = num;
	}

	public void getPrint() {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//getPrint(3);
		public void getPrint(int num) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}		
	}
}

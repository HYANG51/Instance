package java_LJH_instance_example;

public class LottoClassArr {
	
	public static int[] makeLotto() {
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*46 + 1);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arrLotto = makeLotto();
		
		for (int num : arrLotto) {
			System.out.println(num);
		}
	}
}

package java_LJH_instance_example;

public class Lotto {
	public static void main(String[] args) {

		int[] lottoArr = new int[6];

		for(int i=0; i < lottoArr.length; i++) {
			lottoArr[i] = (int)(Math.random() *45) +1;		// 1부터 45까지 랜덤

			// 중복 제거 로직
			for(int j=0; j < i; j++) {
				if(lottoArr[i] == lottoArr[j]) {
					i--;
					break;
				}
			}
		}

		for (int num : lottoArr) {
			System.out.println(num);

		}
	}
}

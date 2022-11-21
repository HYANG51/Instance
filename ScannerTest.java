package java_LJH_instance_example;

import java.util.Scanner;
class Grade2{
	private int math, science, english;

	public Grade2(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public double average(){
		return (math + science + english) / 3.0;
	}
	public String getGrade(){
		
		double avg = average();
		String str = null;
		
		if(avg >= 90) {
			str = "수 입니다.";
		}else if(avg >= 80) {
			str = "우 입니다.";
		}else if(avg >= 70) {
			str = "미 입니다.";
		}else if(avg >= 60) {
			str = "양 입니다.";
		}else {
			str = "글러먹었습니다.";
		}
		return str;
	}
}
public class ScannerTest {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int value = scanner.nextInt();
		
		System.out.println(value);
		value = scanner.nextInt();
		System.out.println(value);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력>> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade2 me = new Grade2(math, science, english);
		System.out.println("평균은 "+me.average());
		System.out.println(me.getGrade());
	}
}

package java_LJH_instance_example;
import java.util.Scanner;
class Grade{
	private int math, science, english;

	public Grade(int math, int science, int english) {
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
public class ScannerGrade {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
         System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
         int math = sc.nextInt();
         int science = sc.nextInt();
         int english = sc.nextInt();
         Grade me = new Grade(math, science, english);
         System.out.println("평균은 "+me.average());
         System.out.println(me.getGrade()); // 수 입니다
	}
}

package java_LJH_instance_example;

public class Grade1 {
	
	int kor;
	int eng;
	int math;
	
	Grade1(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int average() {
		return (kor + eng + math) / 3;
	}
}

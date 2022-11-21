package java_LJH_instance_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		// 1. 목적 : 안죽이게 한다 = 에러의 기본 매커니즘이 아닌 개발자가 에러를 처리한다.
		// 2. 실행에 대하여 : 
		// 3. 활용 : 넣는 위치
		
		try {
			System.out.print("a / b...a?");
			int n1 = kb.nextInt();
			
			System.out.print("a / b...b?");
			int n2 = kb.nextInt();
			
			System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);		// 예외 발생 지점
		}
		catch(InputMismatchException e) {	// 위에서 Exception하면 밑에 ArithmeticException에서 오류남.
			e.printStackTrace();			// 사유 : 위에서 다 잡아줬기 때문에 밑에서 잡을게 없음.
			//System.out.println(e.getMessage());
			System.out.println("에러가 났습니다. 프로그램을 종료합니다.");
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("에러가 났습니다. 0으로 나눌 수는 없습니다.");
		}finally {
			System.out.println("Good Bye");
		}
	}
}

package java_LJH_instance_example;

import java.util.Scanner;

class RSPPlayer{
	private int rsp;

	public RSPPlayer() {
		rsp = (int)(Math.random()*3 + 1);		// 랜덤은 기본 double이어서 int로 형변환.
	}

	public RSPPlayer(String str) {
		if(str.equals("가위")) {
			rsp = 1;
		}else if(str.equals("바위")) {
			rsp = 2;
		}else {
			rsp = 3;
		}
	}

	private String getRSPString(int rsp) {
		String str = "";

		if(rsp == 1)
			str = "가위";
		else if(rsp == 2)
			str = "바위";
		else
			str = "보";
		return str;
	}

	public void result(RSPPlayer you) {

		System.out.println("나는:" +  getRSPString(rsp) + " 당신은:" + getRSPString(you.rsp));

		if(rsp == you.rsp ) {		// 비겼을 때
			System.out.println("비겼습니다.");
			return;
		}
		//1.가위 2.바위 3.보
		if(this.rsp == 1 && you.rsp == 2){        
			System.out.println("제가 졌습니다.");
		}else if(this.rsp == 1 && you.rsp == 3){
			System.out.println("제가 이겼습니다.");
		}else if(this.rsp == 2 && you.rsp == 1){
			System.out.println("제가 이겼습니다.");
		}else if(this.rsp == 2 && you.rsp == 3){
			System.out.println("제가 졌습니다.");
		}else if(this.rsp == 3 && you.rsp == 1){
			System.out.println("제가 졌습니다.");
		}else if(this.rsp == 3 && you.rsp == 2){
			System.out.println("제가 이겼습니다.");
		}
	}
}

public class RspTest{
	public static void main(String[] args) {        

		while(true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("가위 바위 보를 입력하세요.");
			String rsp = sc.next();		// 문자열 받기.

			RSPPlayer you = new RSPPlayer(rsp);    
			RSPPlayer com = new RSPPlayer();

			com.result(you);		// 결과 보여줌

			System.out.println("계속 Y :: 중단 N");
			String stop = sc.next();

			if(stop.equals("N") || stop.equals("n")) {

				break;
			}
		}
		System.out.println("안녕히 가세요");
	}
}
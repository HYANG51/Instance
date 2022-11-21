package java_LJH_instance_example;

import java.util.Scanner;

class Gamer{
	   private String name;
	   private int[] arrNum;
	   
	   public Gamer(String name) {
	      this.name = name;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public boolean game() {
	      arrNum = new int[3];
	      
	      for(int i=0; i< arrNum.length;i++) {
	         arrNum[i] = (int) (Math.random()*3 + 1);
	      }
	      
	      System.out.print(arrNum[0]+" "+arrNum[1]+" "+arrNum[2]+" ");
	      
	      if((arrNum[0] == arrNum[1]) && (arrNum[1]== arrNum[2])) {
	         return true;
	      }
	      
	      return false;
	   }
	   
	   
	}

public class GameTestnthPeople {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = scanner.nextInt();
		Gamer[] gamer = new Gamer[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print((i+1)+ "번째 선수 이름>>");
			String name = scanner.next();
			gamer[i] = new Gamer(name);
		}
		
		String buffer = scanner.nextLine();
		
		while (true) {
			for (int i = 0; i < num; i++) {
				System.out.print("[" + gamer[i].getName() + "]:<Enter>");
				buffer = scanner.nextLine();	// 엔터 받아냄
				
				if(gamer[i].game()) {
					System.out.println(gamer[i].getName() + "님이 이겼습니다.");
					return;
				}
				System.out.println("아쉽군요");
			}
			
		}
	}
}

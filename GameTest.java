package java_LJH_instance_example;

import java.util.Scanner;
// alt+shift+R -> 애들 이름 한번에 수정하기
class GamePlayer{
   private String name;
   private int[] arrNum;
   
   public GamePlayer(String name) {
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

class GameTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("1번째 선수 이름>>");
      String name = scanner.next();
      Gamer p1 = new Gamer(name);
      
      System.out.print("2번째 선수 이름>>");
      name = scanner.next();
      Gamer p2 = new Gamer(name);
      
      //버퍼 깨끗이 비우기
      String buffer = scanner.nextLine();
            
      while(true) {
         System.out.print("[" + p1.getName() + "]:<Enter>");
         buffer = scanner.nextLine();
         
         if(p1.game()) {
            System.out.println(p1.getName() +"님이 이겼습니다.");
            break;
         }
         System.out.println("아쉽군요!");
         
         System.out.print("[" + p2.getName() + "]:<Enter>");
         buffer = scanner.nextLine();


         if(p2.game()) {
            System.out.println(p2.getName() +"님이 이겼습니다.");
            break;
         }
         System.out.println("아쉽군요!");
         
      }
      
      scanner.close();
   }
}
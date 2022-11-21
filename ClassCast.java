package java_LJH_instance_example;

class Board{ }
class PBoard extends Board{ }
public class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;		// ㅇㅋ

		System.out.println(".. intermediate location ..");
		
		//Board ebd1 = new Board();
		//PBoard ebd2 = (PBoard)ebd1;   // Exception!

		try {
			Board ebd1 = new Board();
			PBoard ebd2 = (PBoard)ebd1;   // Exception!
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러 처리입니다.");
		}
	}
}

		/*try {
			Board ebd1 = new Board();
			PBoard ebd2 = (PBoard)ebd1;		// Exception
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("에러 처리입니다.");
		}
	}
}*/

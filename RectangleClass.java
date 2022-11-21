package java_LJH_instance_example;

public class RectangleClass {
	public static  int arraySum(int[] ar) {
		int sum = 0;

		// 배열 요소의 전체 합 출력     
		for(int e: ar) {
			sum += e;
		}

		return sum;      
	} 

	/*
	   1.아래를 프로그래밍 하시오.

	   다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.

	   - int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보

	   - x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
	   - int square() : 사각형 넓이 리턴
	   - void show() : 사각형의 좌표와 넓이를 화면에 출력
	   - boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴

	   - main() 메소드의 코드와 실행 결과는 다음과 같다

	   public static void main(String[] args) {
	   Rectangle r = new Rectangle(2, 2, 8, 7);
	   Rectangle s = new Rectangle(5, 5, 6, 6);
	   Rectangle t = new Rectangle(1, 1, 10, 10);

	   r.show();
	   System.out.println("s의 면적은 "+s.square());
	   if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
	   if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	   }
	   출력
	   ========================
	   (2,2)에서 크기가 8x7인 사각형
	   s의 면적은 36
	   t는 r을 포함합니다.
	 */   
	public static void main(String[] args) {

		RectangleClass r = new RectangleClass(2, 2, 8, 7);
		RectangleClass s = new RectangleClass(5, 5, 6, 6);
		RectangleClass t = new RectangleClass(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 "+s.square());

		if(t.contains(r)) 
			System.out.println("t는 r을 포함합니다.");

		if(t.contains(s)) 
			System.out.println("t는 s를 포함합니다.");


	}


	private int x, y, width, height;

	public RectangleClass(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("(" + x + ", " + y + ") 에서 크기가 " + width + "x" + height + "인 四角形");
	}

	public int square() {
		int area = width * height;
		return area;
	}
	public boolean contains(RectangleClass r) {
		if((this.x < r.x) && 
		   (this.x + this.width) > (r.x + r.width) && 
		   (this.y < r.y) && 
		   (this.y + this.height) > (r.y + r.height)) {
			return true;
		}else {
			return false;
		}
	}
}


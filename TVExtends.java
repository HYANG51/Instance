package java_LJH_instance_example;
/*class T2{
	private int size;
	public T2() {}
	public T2(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends T2 {
	int size;
	int color;

	public ColorTV(int size, int color) {
		this.size = size;
		this.color = color;
	}

	public void printProperty() {
		System.out.println(size + "인치 " + color + "컬러");
	}
}*/

class T2{
	   private int size;
	   public T2(int size) { 
		   this.size = size; 
		   }
	   protected int getSize() {		// protected -> 패키지 상관 없이 상속관계에서 상속받은 자식에서 무조건 써먹을 수 잇음
		   return size; 
		   }
	}
class ColorTV extends T2{
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러"); 	
		// super.size는 위에 T2에서 private로 선언했기때문에 불러오지 못함.
		// thsi.color로 해도 되고 안해도 되고
	}
}
public class TVExtends {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
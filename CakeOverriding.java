package java_LJH_instance_example;
class Cake2{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}
// 덮어쓴다 = 선언(리턴 타입 함수이름 파라미터)은 같고 바디만 달리한다.
// 오버라이딩은 기본적으로 덮어씀
class CheeseCake2 extends Cake2{
	// Cake의 yummy 메소드를 오버라이딩함.
	
	@Override	// 부모클래스에서 같은 이름 있으면 오버라이딩함. (이름 같은거 없으면 오류남)
	// 써주는게 좋음. 다른 사람들이 확인하기도 편하니까.
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class CakeOverriding {
	public static void main(String[] args) {
		
		Cake2 c1 = new CheeseCake2();
		CheeseCake2 c2 = new CheeseCake2();
		
		c1.yummy();
		c2.yummy();
		
		// 오버라이딩은 자식꺼. 
	}
}

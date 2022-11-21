package java_LJH_instance_example;
class Cake{
	public void sweet() {

	}
}

class CheeseCake extends Cake{
	public void milky() {

	}
}
public class CakeExample {
	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;		// 가능

		Cake ca3 = new CheeseCake();
		//CheeseCake ca4 = ca3;		불가능
		CheeseCake ca4 = (CheeseCake)ca3;	
		// CheeseCake로 형변환하면 가능. 되는 이유 : 위에서 CheeseCake를 new로 이미 만들었으니까~!
	}
}

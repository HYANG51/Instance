package java_LJH_instance_example;
class Person1 {
	private String name;

	public Person1(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Person1) {
			Person1 you = (Person1) obj;

			if(this.name.equals(you.name))
				return true;
		}

		return false;
	}

}

public class PersonEquals {
	public static void main(String[] args) {
		Person1 p1 = new Person1("홍길동");
		System.out.println(p1.equals(new Person1("홍길동")));
		System.out.println(p1.equals(new Person1("최명태")));
	}
}

package java_LJH_instance_example;

public class StringConcat {
	public static void main(String[] args) {
		
		System.out.println("funny" + "camp");
		// = System.out.println("funny".concat("camp"));
		
		String str1 = "funny";
		str1 += "camp";		// = str = str + "camp"
		// = str = str.concat("camp");
		System.out.println(str1);
		
		String str2 = "age: " + 17;
		// X String str2 = "age: ".concat(17);
		// O str2 = "age: ".concat(String.valueOf(17));
		System.out.println(str2);

		String str3 = "AB".concat("CD").concat("EF");
		/* = String str3 = ("AB".concat("CD")).concat("EF");	concat은 이어서 호출 가능.
		   = String str3 = "ABCD".concat("EF");
		   = String str3 = "ABCDEF";*/	
		
		System.out.println(str3);
		
		
		int i = 10;
		double d = 3.14;
		
		String str = String.valueOf(i);
		str = String.valueOf(d);
		str = String.valueOf(true);		// 0->false, 1->true
				
		System.out.println(str);
				
		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 = st1.concat(st2);
		System.out.println(st3);

		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		if(st1 == st3)
			System.out.println("난 알아요");
	}
}

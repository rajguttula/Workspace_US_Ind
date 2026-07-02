package day1;

class Parent{
	int name=1234;
	String n="Hari";
	void m1() {
		System.out.println("It is m1 from parent");
	}
}

class Child extends Parent{
	int n=100;
	void m2() {
		System.out.println("It is m2 from child");
	}
	
	void m3() {
		System.out.println("It is m3 from child");
	}
}

public class TypeCasting {

	public static void main(String []args) {
		Parent p=new Child();
		System.out.println(p.name);
		p.m1();
		
		Parent p1=new Parent();
		Child c=(Child)p1;
		System.out.println(c.name);
		System.out.println(c.n);
		c.m1();
		c.m2();
		
	}
}

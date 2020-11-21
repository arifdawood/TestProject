package practice;

class A {
	public A() {
		System.out.println("A is initiated");
	}
	static {
		System.out.println("A is loaded");
	}
}

class B {
	static int value;
	static {
		value = 10;
		System.out.println("B is loaded");
	}
}


public class StaticUses {

	public static void main(String[] args) {
		A x = new A();
		System.out.println("B value is " + B.value);
		A y = new A();
	}

}

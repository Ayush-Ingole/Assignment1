package chaper_1;

class C {
	void add(int a, int b) {
		System.out.println(a + b);
	}
}

class B extends C {
	@Override
	void add(int a, int b) {
		System.out.println(a + b + " Thank you");
	}

	void meth1() {
		System.out.println("dsf");
	}
}

public class Q5 {
	public static void main(String[] args) {
		C c = new C();
		c.add(2, 9);
		B b = new B();
		b.add(2, 1);
	}

}

package chaper_1;

class A {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class Q4 {
	public static void main(String[] args) {
		A a = new A();
		a.add(2, 2);
		a.add(4, 6, 4);

	}

}

package chapter_8;

class A {
	void meth() {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class TryCatches {
	public static void main(String[] args) {
		A a = new A();
		a.meth();
	}
}

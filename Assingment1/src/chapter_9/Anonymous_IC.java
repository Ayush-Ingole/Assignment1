package chapter_9;

interface A {
	void A();
}

abstract class B {
	abstract void B();
}

class C {
	void C(A a,B b) {
		a.A();
		b.B();
	}
}


public class Anonymous_IC {
	public static void main(String[] args) {
		A a = new A() {
			@Override
			public void A() {
				System.out.println("Interface anonymous class");
			}
		};
		a.A();

		B b = new B() {
			@Override
			void B() {
				System.out.println("Abstract anonymous class");
			}
		};
		b.B();

		C c = new C() {
			@Override
			void C(A a, B b) {
				// TODO Auto-generated method stub
				super.C(a, b);
			}
		};
		c.C(a, b);
	}
}

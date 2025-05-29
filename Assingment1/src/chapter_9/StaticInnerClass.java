package chapter_9;

import chapter_9.Outeer.Inner;

class Outeer {
	private static int a = 10;

	static class Inner {
		static void sMeth() {
			System.out.println("static method " + a);
		}

		void nsMethod() {
			System.out.println("Non static method " + a);
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
//	Outter outter = new Outter();
		Outeer.Inner inner = new Outeer.Inner();
		Outeer.Inner.sMeth();
		inner.nsMethod();
		Inner.sMeth();
	}
}

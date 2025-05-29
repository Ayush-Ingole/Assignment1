package chapter_9;

class Outter {
	private int a = 10;

	class Inner {
		void showOutter() {
			System.out.println("inner method " + a);
		}
	}
}

public class SimpleInnerClass {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		inner.showOutter();
	}
}

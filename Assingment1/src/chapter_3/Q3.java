package chapter_3;

class Calculator {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

class AdvCal extends Calculator {
	@Override
	void add(int a, int b) {
		System.out.println("new...");
		System.out.println(a + b);
		System.out.println("exit...");
	}
}

public class Q3 {
	public static void main(String[] args) {
		Calculator ob = new Calculator();
		ob.add(1, 33);
		ob.add(2, 8, 9);
		AdvCal advCal = new AdvCal();
		advCal.add(2, 8);
	}
}

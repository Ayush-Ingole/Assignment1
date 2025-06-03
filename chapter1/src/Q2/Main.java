package Q2;

public class Main {
	static int a = 10;
	static int b = 20;
	int c = 20;
	int d = 30;

	static void display() {
		System.out.println(a);
		System.out.println(b);
	}

	void display1() {
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.display1();
		Main.display();
	}
}

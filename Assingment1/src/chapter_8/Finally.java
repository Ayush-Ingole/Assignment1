package chapter_8;

class F{
	void meth1() {
		try {
			int a = 10;
			a = a / 5;
			System.out.println(a);
		} catch (ArithmeticException a) {
			System.out.println(a + "Cannot divide by that zerp");
		}finally {
			System.out.println("Block that always execute");
		}
	}
}

public class Finally {
	public static void main(String[] args) {
		F f = new F();
		f.meth1();
	}
}

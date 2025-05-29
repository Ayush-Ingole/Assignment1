package chapter_8;

class Multile_Catch_block {
	void meth() {
		try {
			int a[] = new int[3];
			a[5] = 3;
			System.out.println(a[1]);
			int b = 2 / 0;
			System.out.println(b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Be in your limit");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Multi_catch {
	public static void main(String[] args) {
		Multile_Catch_block ob = new Multile_Catch_block();
		ob.meth();
	}
}

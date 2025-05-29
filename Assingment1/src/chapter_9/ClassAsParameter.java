package chapter_9;

class Outer {
	class Inner {
		int value;

		Inner(int value) {
			this.value = value;
		}
		
		static void meth() {
			System.out.println("Hi from inner class");
		}
	}

	void display(Inner obj) {
		System.out.println("Value from Inner: " + obj.value);
	}
}

public class ClassAsParameter {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(42);
		chapter_9.Outer.Inner.meth();
		outer.display(inner); 
	}
}

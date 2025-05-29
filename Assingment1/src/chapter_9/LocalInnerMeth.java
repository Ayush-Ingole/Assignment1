package chapter_9;

class Outerr {
	void outerMeth() {
		class Inner {
			void innerMeth() {
				System.out.println("local inner");
			}
		}
		Inner inner = new Inner();
		inner.innerMeth();
	}
}

public class LocalInnerMeth {
	public static void main(String[] args) {
		Outerr outerr = new Outerr();
		outerr.outerMeth();
	}
}

package chapter_8;

class myException extends Exception {
	public myException(String s) {
		super(s);
	}

}

class U{
	void age(int age) {
		try {
			if (age < 18) {
				throw new myException("you cannot vote");
			} else {
				System.out.println("you are eligible");
			}
		} catch (myException e) {
			System.out.println(e);
		}

	}
}

public class User_Exception {
	public static void main(String[] args) {
		U ob = new U();
		ob.age(1);
	}
}

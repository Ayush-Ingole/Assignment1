package chapter_3;

class A {
	static String name;

	static void setName() {
		System.out.println(name);
	}
}

public class Q1 {

	public static void main(String[] args) {
		A.name = "Sujeet";
		A.setName();
	}
}

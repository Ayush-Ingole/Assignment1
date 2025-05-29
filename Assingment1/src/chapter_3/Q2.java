package chapter_3;

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}

public class Q2 {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Tom");
		System.out.println(emp);
	}
}

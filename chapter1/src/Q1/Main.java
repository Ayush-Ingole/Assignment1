package Q1;

class Emp {
	String name;
	int id;
	double sal;
	String address;

	void display(String name, int id, double sal, String address) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display("Shravan", 111, 236700, "Dahisar");
	}
}

package chaper_1;

class Emp {
	int id;
	double sal;
	String name;
	String address;

	public Emp(int id, double sal, String name, String address) {
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", sal=" + sal + ", name=" + name + ", address=" + address + "]";
	}

	void info() {
		System.out.println(id + " " + sal + " " + name + " " + address);
	}

}

public class Q1 {
	public static void main(String[] args) {
		Emp emp = new Emp(1, 10000, "tom", "mira-road");
		System.out.println(emp);
		emp.info();
	}
}

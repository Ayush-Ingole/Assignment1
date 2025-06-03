package Q1;

public class Main1 {
	String name;
	int id;
	double sal;
	String address;

	public Main1(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Main1 [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Main1 main1 = new Main1("Shravan",111,1500000,"Dahisar");
		System.out.println(main1);
	}
}

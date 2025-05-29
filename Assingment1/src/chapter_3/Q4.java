package chapter_3;

class Emps {
	private int id;
	private double salary;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
}

public class Q4 {
public static void main(String[] args) {
	Emps emp = new Emps();
	emp.setId(1);
	System.out.println(emp.getId());
}
}

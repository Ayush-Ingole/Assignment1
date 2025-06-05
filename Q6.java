package chaper_1;

class Department {
	String name;

	Department(String name) {
		this.name = name;
	}
}

class University {
	Department department; // Aggregation

	University(Department department) {
		this.department = department;
	}

	void showDepartment() {
		System.out.println("Department: " + department.name);
	}
}

class Heart {
	void pump() {
		System.out.println("Heart is pumping");
	}
}

class Human {
	private Heart heart;

	Human() {
		heart = new Heart(); // Composition: heart is part of human
	}

	void startLife() {
		heart.pump();
		System.out.println("Human is alive");
	}
}

public class Q6 {
	public static void main(String[] args) {
		System.out.println("Don't know how to do");
	}
}

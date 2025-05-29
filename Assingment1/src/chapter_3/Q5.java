package chapter_3;

class EmpDetails{
	String name = "tom";
	static String comp="tcs";
	void meth(int id) {
		System.out.println(id);         
	}
}

public class Q5 {
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		System.out.println(EmpDetails.comp);
		System.out.println(emp.name);
		emp.meth(2);
	}
}


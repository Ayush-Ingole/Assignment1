package chaper_1;
class Employee {
	int id;
	static String comp = "TCS";

	int non_static(int id) {
		return this.id = id;
	}

	static void meth_static() {
		System.out.println(comp);
	}
}
public class Q2 extends Q3{
		public static void main(String[] args) {
			Employee emp = new Employee();
			System.out.println(emp.non_static(1));
			Employee.meth_static();
			
			Q3 main3 = new Q3();
			System.out.println(main3.b);
//			System.out.println(main3.c);
		}
	
}

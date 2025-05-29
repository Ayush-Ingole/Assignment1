package chaper_1;
public class Q3 {
	private int a = 1;
	public int b = 2;
	protected int c = 3;        //not running in other package doubt
	int d = 4;
	public static void main(String[] args) {
		Q3 a = new Q3();
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println(a.a);
		
	}
}

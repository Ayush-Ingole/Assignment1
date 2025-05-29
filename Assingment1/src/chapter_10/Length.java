package chapter_10;

class WrapperClass {
	int a = 10;
	Integer b = new Integer(10);    // old way
	Integer d = a;                 // new way
	int c = b.intValue();          // old way
	int e = b;                    // new way
}

public class Length {
	public static void main(String[] args) {
	String s = "Hello Moto";
	String q = "Hello Moto";
	System.out.println(s.length()+" "+s);
	System.out.println(s.concat(q));
	System.out.println(s.trim());
	System.out.println(s.replaceFirst("l", "e"));
	System.out.println(s);
	System.out.println(s.compareTo(q));
	
	System.out.println("Valueof() method is pending    "+"Don't know how to do");
	}
}

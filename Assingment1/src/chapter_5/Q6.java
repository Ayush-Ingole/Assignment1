package chapter_5;

class A{
	void meth() {
		System.out.println("from A");
	}
	
	A(){
		System.out.println("hello...");
	}
}

class B extends A{                            //Single level
	void meth1(){
		System.out.println("form B");
//		super();
	}
}

class C extends B{                           //multilevel
	void meth2(){
		System.out.println("from c");
//		super();
	}
}

class D extends A{                           //hierarchical
	void meth3() {
		System.out.println("meth 3");
	}
	D(){
		System.out.println("from D");
//		super();
	}
}

public class Q6 {
	public static void main(String[] args) {
		C c = new C();
		
	}
}





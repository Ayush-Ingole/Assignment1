package chapter_8;

import java.io.IOException;

class Aa{
	void Aa() throws IOException{
		IOException i = new IOException("kaise ");
		throw i;
	}
}
	
class B extends Aa{
	B() throws IOException {
		super.Aa();
	}
}

public class Propagation {
	public static void main(String[] args) {
		try {
			B b = new B();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}


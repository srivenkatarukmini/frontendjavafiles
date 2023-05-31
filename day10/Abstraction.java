package day10;

abstract class animal {
	abstract void soun();
	public void type() {
		System.out.println("types of animals");
	}
	
}
class catt extends animal {
	public void soun() {
		System.out.println("meow meow!!!");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		catt sr=new catt();
		sr.soun();
		sr.type();
	}

}

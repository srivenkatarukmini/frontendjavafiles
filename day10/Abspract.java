package day10;

abstract class Animals{
	abstract void sounds();
	/*abstract void color();*/
		public void type() {
			System.out.println("animals");
	}
}
 class cat extends Animals{
	public void sounds() {
		System.out.println("i am cat");
		System.out.println("i make sound as meow meow!!");
	}
	/*public void color() {
		System.out.println("i am cat");
		System.out.println("cat is white");
	}*/
	
}
  class dog extends Animals{
	public void sounds() {
		System.out.println("i am dog");
		System.out.println("i make sound as bow bow!!");
	}
}
   class cow extends Animals{
	public void sounds() {
		System.out.println("i am cow");
		System.out.println("i make sound as ambaa");
	}
}


public class Abspract {
	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		cow w=new cow();
		c.type();
		c.sounds();
		/*c.color();*/
		d.sounds();
		w.sounds();
	}

}

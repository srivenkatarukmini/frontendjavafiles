package day11;



	abstract class Animals{
		abstract void sounds();
			public void type() {
				System.out.println("animals");
		}
	}
	class cat extends Animals{
		public void sounds() {
			System.out.println("i am cat");
			System.out.println("i make sound as meow meow!!");
		}
		
	}
	class dog extends Animals{
		public void sounds() {
			System.out.println("i am dog");
			System.out.println("i make sound as bow bow!!");
		}
	}

	public class pakage {
		public static void main(String[] args) {
			cat c=new cat();
			dog d=new dog();
			c.type();
			c.sounds();
			d.sounds();
		}

	}



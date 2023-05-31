package day10;

class teacher{
	int a=10;
	public void teach() {
		System.out.println("i am a teacher");
	}
}
class mathsteach extends teacher{
	public void teach() {
		super.teach();
		System.out.println("i am a maths teacher");
	}
}

public class Methodoverride {
	public static void main(String[] args) {
		mathsteach mt=new mathsteach();
		mt.teach();
		System.out.println(mt.a);
		
		
		
		
		
		
		
	
	}

}

package day9;

class parent{
	int age=20;
	public void pri() {
		System.out.println("hi i am super class");
	}
}

public class Inheritance extends parent {
	public static void main(String[] args) {
		Inheritance re=new Inheritance();
		re.pri();
		System.out.println(re.age);
		
	}
	
	

}

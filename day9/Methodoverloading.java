package day9;

public class Methodoverloading {
	
	public void over(String d) {
		System.out.println(d);
		
	}
	public void over(int a) {
		System.out.println(a);
	}
	public void over(int b,String c) {
		System.out.println("name is "+c+" age "+b);
	}
	public void over(String e,int f) {
		System.out.println("name is "+e+" age "+f);
	}
	

	public static void main(String[] args) {
		Methodoverloading ru=new Methodoverloading();
		ru.over(19);
		ru.over("cbit");
		ru.over("rukku",20);
		ru.over(19,"psvrd");
	}
}

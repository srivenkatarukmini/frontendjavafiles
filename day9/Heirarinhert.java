package day9;

class father{
	String name="Srinivasula reddy";
	public void pr() {
		System.out.println("hi i am father");
	}
}
class son extends father {
	public void pr() {
		super.pr();
		System.out.println("hi i am son");
		
	}
	int age=10;
}
class daughter extends father {
	public void pr() {
		
		System.out.println("hi i am daughter");
	}
	int age1=15;
}


public class Heirarinhert {
	public static void main(String[] args) {
		Heirarinhert psv=new Heirarinhert();
		son sn=new son();
		daughter da=new daughter();
		System.out.println(sn.age);
		System.out.println(sn.name);
		System.out.println(da.age1);
		System.out.println(da.name);
		sn.pr();
		da.pr();
		}
	}



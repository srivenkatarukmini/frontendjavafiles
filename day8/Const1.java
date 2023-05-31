package day8;

public class Const1 {
	private String name;
	private int age;
	
	//const
	public Const1(int a,String b) {
		age=a;
		name=b;
		
	}
	//another method for getting data
	public int getAge() {
		return age;
	}
	public String nam() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Const1 con=new Const1(23,"rukku");
		Const1 con1=new Const1(20,"sree");
		int ag=con.getAge();
		String name=con.nam();
		System.out.println(ag);
		System.out.println(name);
		System.out.println("My name is "+con1.name+ " and age is "+con1.age);
		
	}

}

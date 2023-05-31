package day11;

public class Staticmethod {
	String stdname="rukku";
	int rollno;
	 static String clgname;
	
	Staticmethod(int rollno,String name){
		this.stdname=stdname;
		this.rollno=rollno;
		//this.clgname=clgname;//
		
	}
	public static void change() {
		clgname="srit";
	}
	

	//method
	public void display() {
		System.out.println("my name is "+stdname);
		System.out.println("my rollno is "+rollno);
		System.out.println("my clg name is "+clgname);
		
	}
	
	//main method
	public static void main(String[] args) {
		Staticmethod sv=new Staticmethod(10,"rukku");
		change();
		sv.display();
		
		
		
		
		
	}
}



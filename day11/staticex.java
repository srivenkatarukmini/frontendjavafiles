package day11;



public class staticex {

	String name;
	int rollno;
	 static String clgname="cbit";
	
	staticex(int rollno,String name,String clgname){
		this.name=name;
		this.rollno=rollno;
		this.clgname=clgname;
		
	}

	//method
	public void display() {
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my clg name is "+clgname);
		
	}
	
	//main method
	public static void main(String[] args) {
		staticex st=new staticex(10,"rukku","cbit");
		staticex st1=new staticex(12,"sree","vbit");
		st.display();
		st1.display();
		
		
		
		
	}
}



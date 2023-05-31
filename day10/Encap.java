package day10;

import java.util.Scanner;

class svr {
	private String name;
	private int age;
	
	//setters
	public void setname(String name) {
		this.name=name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	//getting the value
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
}

public class Encap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		svr pr=new svr();
		System.out.println("enter the name");
		String n=sc.next();
		System.out.println("enter the age");
		int a=sc.nextInt();
		pr.setname(n);
		pr.setage(a);
		System.out.println("my name is "+pr.getname()+" my age is "+pr.getage());
		
	}
}

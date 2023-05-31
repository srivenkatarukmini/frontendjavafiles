package day10;

import java.util.Scanner;

public class Polymorphism {
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
		Scanner sc=new Scanner(System.in);
		Polymorphism vr=new Polymorphism();
		vr.over(19);
		vr.over("cbit");
		vr.over("rukku",20);
		vr.over(19,"psvrd");
	}

}

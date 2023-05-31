package day8;

import java.util.Scanner;

public class Rectarea1 {

	//no par no ret
	//method creation
	public double print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of l");
		int l=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		int area=l*b;
		return area;
	
		}
	//main method
	public static void main(String[] args) {
		Rectarea1 ps=new Rectarea1();
		ps.print();
	}
}

package day8;

import java.util.Scanner;

public class Noparnoret {
	public double print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of r");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		return area;
	
		}
	//main method
	public static void main(String[] args) {
		Noparnoret ps=new Noparnoret();
		ps.print();
	}
}

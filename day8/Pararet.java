package day8;

import java.util.Scanner;

public class Pararet {
	public Double add(Double PI,Double r) {
		Double area=Math.PI*r*r;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pararet sum=new Pararet();
		System.out.println("enter value for PI");
		Double PI=sc.nextDouble();
		System.out.println("enter value for r");
		Double r=sc.nextDouble();
		Double area=PI*r*r;
		System.out.println(area);
	}

}

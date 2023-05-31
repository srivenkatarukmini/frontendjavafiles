package day8;

import java.util.Scanner;
//para
public class Circlearea3 {
	public void pri(Double PI,Double r) {
		double area=Math.PI*r*r;
		System.out.println("the area of circle is "+area);
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circlearea3 sr=new Circlearea3();
		System.out.println("enter the value of r");
		double r=sc.nextDouble();
		sr.pri(Math.PI,r);
	}
 
}

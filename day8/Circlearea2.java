package day8;
import java.util.Scanner;
public class Circlearea2 {
	//ret
	public double pri() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of r");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		return area;
		
	}
	//main method
	public static void main(String[] args) {
		Circlearea2 sv=new Circlearea2();
		Double a=sv.pri();
		System.out.println("The area of circle is"+a);
	}
}

package day8;
import java.util.Scanner;
public class Circlearea4 {
//parret
		//method creation
			public double print(Double PI,Double r) {
				double area=Math.PI*r*r;
				return area;
			}
			//main method
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				Circlearea4 result=new Circlearea4();
				System.out.println("Enter the value of r:");
				double r=sc.nextDouble();
				double res=result.print(Math.PI,r);
				System.out.println("The area of circle is: "+res);
			}
	}


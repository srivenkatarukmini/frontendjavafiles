package day8;

import java.util.Scanner;
public class Circlearea1 {
	
		//no par no ret
		//method creation
		public double print() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of r");
			double r=sc.nextDouble();
			double area=Math.PI*r*r;
			return area;
		
			}
		//main method
		public static void main(String[] args) {
			Circlearea1 ps=new Circlearea1();
			ps.print();

			
			
			
		}
		
		
	}

 

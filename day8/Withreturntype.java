package day8;

import java.util.Scanner;
public class Withreturntype {
	Scanner sc=new Scanner(System.in);
	public int ret() {
		int n1=10;
		int n2=20;
		int sum=n1+n2;
		return sum;  
	}
	public int pri() {
	System.out.println("enter num1");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	int sum=a+b;
	return sum; 
	}
	
	public static void main(String[] args) {
		Withreturntype result=new Withreturntype();
		int sum1=result.ret();
		System.out.println(sum1);
		int sum=result.pri();
		System.out.println(sum);
		
		
		
	}
	

}

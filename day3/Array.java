package day3;

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[5];
		num[0]=5;
		num[1]=4;
		num[2]=3;
		System.out.println(num[0]);
		System.out.println(num[1]);
		for(int i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println(num[j]);
		}
	
	}

}

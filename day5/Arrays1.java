package day5;

import java.util.Scanner;
public class Arrays1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		System.out.println("enter the values in array index");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}

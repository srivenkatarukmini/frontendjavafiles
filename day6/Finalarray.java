package day6;

import java.util.Scanner;
public class Finalarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		System.out.println(arr[2]);
		arr=new int[6];
		arr[0]=15;
		System.out.println(arr[0]);
		final int arr1[]= {20,30,40,50,60};
		System.out.println(arr1[0]);
		/* arr1=new int[6]; */
		arr1[0]=10;
		System.out.println(arr1[0]);
	
		
	}

}

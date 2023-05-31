package day5;

import java.util.Scanner;
import java.util.Arrays;
public class Arraybinass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values in array index");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println(Arrays.asList(arr));
		int key=20;
		System.out.println(Arrays.binarySearch(arr, key));
		
	}



}

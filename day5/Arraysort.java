package day5;


import java.util.Scanner;
import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=3;
		arr[3]=40;
		arr[4]=5;
		for(int i=0;i<arr.length;i++)
		{
		   System.out.println(arr[i]+",");
		}
		System.out.println(Arrays.asList(arr));
		int key=20;
		
		System.out.println(Arrays.binarySearch(arr, key));
		System.out.println(Arrays.binarySearch(arr,1,5,key));
		//Array.toString
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}

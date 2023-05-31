package day6;

import java.util.Scanner;
import java.util.Arrays;
public class Addofmatrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int arr1[][]=new int[n][m];
		int res[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("enter the value for index ["+i+"]["+j+"]");
					arr[i][j]=sc.nextInt();
				}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
		    {
				System.out.print(arr[i][j]+" ");
		    }
				System.out.println();
		  
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
				{
					System.out.println("enter the value for index ["+i+"]["+j+"]");
					arr1[i][j]=sc.nextInt();
				}
			
		}
		
		for(int i=0;i<arr1.length;i++)
		{
		    for(int j=0;j<arr1[i].length;j++)
		    {
				System.out.print(arr1[i][j]+" ");
		    }
				System.out.println();
		}
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
		    {
				
		res[i][j]=arr[i][j]+arr1[i][j];
		System.out.print(res[i][j]+" ");
		
		
		
		
	}
	System.out.println();
		

 }
}
}

package day6;
import java.util.Scanner;
import java.util.Arrays;
public class Addofdiagmatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int sum1=0;
		int arr[][]=new int[n][m];
		System.out.println("array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			    {
				    System.out.println("enter the value for index ["+i+"] ["+j+"]");
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
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
		    {
		    	if(i==j)
				{
					sum=sum+arr[i][j];
				
					
				}
				else
				{
					sum1=sum1+arr[i][j];
				
				}
		    	
			
		    }
			
		}
		System.out.println("the sum is" +sum+ " "+sum1);
		
	}

 }

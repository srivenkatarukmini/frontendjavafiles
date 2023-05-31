package day5;

import java.util.Scanner;
import java.util.Arrays;
public class Jaggedarray2 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[][]=new int[3][];
			int a=sc.nextInt();
			arr[0]=new int[a];
			int b=sc.nextInt();
			arr[1]=new int[b];
			int c=sc.nextInt();
			arr[2]=new int[c];
			for(int i=0;i<arr.length;i++) 
			{
				for(int j=0;j<arr[i].length;j++)
					{
						System.out.println("enter the index for ["+i+"]["+j+"]");
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
			
			
			
			
			
	}		
			
}

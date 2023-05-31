package day5;

import java.util.Scanner;
import java.util.Arrays;
public class Jaggedarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		int a=sc.nextInt();
		arr[0]=new int[a];
		int b=sc.nextInt();
		arr[1]=new int[b];
		int c=sc.nextInt();
		arr[2]=new int[c];
		arr[0][0]=4;
		arr[0][1]=2;
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		arr[2][0]=9;
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

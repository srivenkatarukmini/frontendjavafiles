package day4;

import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(100/i);
			}
			else
			{
				System.out.println(100*i);
			}
		}
	}

}

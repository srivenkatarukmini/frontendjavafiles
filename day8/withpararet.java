package day8;
import java.util.Scanner;
public class withpararet {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		withpararet sum=new withpararet();
		System.out.println("enter value for a:");
		int a=sc.nextInt();
		System.out.println("enter value for :b");
		int b=sc.nextInt();
		int res=sum.add(a,b);
		System.out.println(res);
	}

}

package day12;

import java.util.Scanner;

class asignm extends Thread {
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Students assignment started");
		System.out.println("enter the chapter to do the assignment");
		int a=sc.nextInt();
		System.out.println("student completed assignment"+a);
	}
}

class print extends Thread {
	 public void run() {
		 System.out.println("printing started");
			for(int i=0;i<4;i++)
			{
				System.out.println("cbit");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
			System.out.println("printing ended");
		 }
	 
 }
 
class opera extends Thread {
	 public void run() {
		 System.out.println("addition operation started");
			int num1=10;
			int num2=20;
			try {
				Thread.sleep(5500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int res=num1+num2;
			System.out.println("sum="+res);
			System.out.println("addition ended");
			
	 }
	 
 }
 class operator1 extends Thread{
	 public void run() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("multiplication operation started");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int mul=num1*num2;
			System.out.println(mul);
			System.out.println("multiplication ended");
	 }
 }
 
  


public class Multithreadpract {
	public static void main(String[] args) {
		asignm l=new asignm();
		print o=new print();
		opera p=new opera();
		operator1 u=new operator1();
		 l.start();
		 o.start();
		 p.start();
		 u.start();
		 
	}

}

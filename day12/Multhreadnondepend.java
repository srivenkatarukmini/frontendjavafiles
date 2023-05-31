package day12;

import java.util.Scanner;

	class asign extends Thread {
		public void run() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Students assignment started");
			System.out.println("enter the chapter to do the assignment");
			int a=sc.nextInt();
			System.out.println("student completed assignment"+a);
		}
	}
	
	 class printing extends Thread {
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
	 
	 class operators extends Thread {
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
				System.out.println(res);
				System.out.println("addition ended");
				
		 }
		 
	 }
	 
	 public class Multhreadnondepend  {
	public static void main(String[] args) {
		
		asign l=new asign();
		printing o=new printing();
		operators p=new operators();
		 l.start();
		 o.start();
		 p.start();
		 
	}

}

package day8;
import java.util.Scanner;
public class Const2 {
	
	private String empname;
	private String addr;
	private int salary;
	
	public Const2(String a,String b,int c) {
	empname=a;
	addr=b;
	salary=c;
	}
	
		public String empname() {
			return empname;
		}
		public String addr() {
			return addr;
		}
		public int salary() {
			return salary;
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String a=sc.next();
			String b=sc.next();
			int c=sc.nextInt();
			Const2 con=new Const2(a,b,c);
			String name=con.empname();
			String add=con.addr();
			int sal=con.salary();
			System.out.println(name);
			System.out.println(add);
			System.out.println(sal);
			
			
		}
	

}

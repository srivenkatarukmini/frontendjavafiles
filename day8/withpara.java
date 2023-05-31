package day8;
import java.util.Scanner;
public class withpara {
	Scanner sc=new Scanner(System.in);
	/*public void pri(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		withpara scc=new withpara();
		scc.pri("Rukmini");
	}*/

	public void pri(String name,int num) {
		System.out.println(name+ " is "+num+" old ");
	}
	
	public static void main(String[] args) {
		withpara scc=new withpara();
		scc.pri("Rukmini",20);
	}
}

package day8;
import java.util.Scanner;
public class Paracircle {
	Scanner sc=new Scanner(System.in);
	public void pri(Double PI,Double r) {
		double area=Math.PI*r*r;
		System.out.println("the area of circle is " +area);
		

	}
	public static void main(String[] args) {
		Paracircle sc=new Paracircle();
		sc.pri(3.14,3.0);
	}
}

package day11;
import java.util.Scanner;
interface sum{
	void avalue();
	void bvalue();
}
interface sub{
	void cvalue();
	void dvalue();
}
abstract class info  implements sum,sub{
	
	@Override
	public void avalue() {
		// TODO Auto-generated method stub
		System.out.println("the value of a is 11");
	}

	@Override
	public void bvalue() {
		System.out.println("the value of b is 19");
		// TODO Auto-generated method stub
		
	}
	public void cvalue() {
		System.out.println("the value of c is 5");
	}
	class arith extends info {
		public void dvalue() {
			System.out.println("the value of d is 3");
		}
	}
	
	
 }
public class Newinterface {
	public static void main(String[] args) {
		
		arith i=new arith();
		i.avalue();
		i.bvalue();
		i.cvalue();
		i.dvalue();
	}

}

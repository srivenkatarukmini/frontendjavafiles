package arraylistclass;

import java.util.Stack;
public class Stackkk {
	public static void main(String[] args) {
		Stack ab=new Stack();
		ab.push(10);
		ab.push(20);
		ab.push(30);
		ab.push(40);
		ab.push(50);
		System.out.println(ab);
		ab.pop();
		System.out.println(ab);
		ab.pop();
		System.out.println(ab);
		ab.push(19);
		System.out.println(ab);
		System.out.println(ab.isEmpty());
		System.out.println(ab.peek());
		System.out.println(ab.contains(30));
		ab.trimToSize();
		System.out.println(ab);
		System.out.println(ab.subList(1,3));
		
		

	}
	
}

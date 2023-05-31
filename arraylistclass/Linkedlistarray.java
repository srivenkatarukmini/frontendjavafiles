package arraylistclass;

import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
public class Linkedlistarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> es=new LinkedList<String>();
		/*System.out.println("enter the value");
		es.add(sc.nextInt());
		System.out.println("enter the name");
		es.add(sc.next());
		System.out.println("enter the value");
		es.add(sc.nextInt());*/
		
		//add()
		
		es.add("cbit");
		es.add("psvrd");
		es.add("pdtr");
		//poll first
		//es.pollFirst();
		
		//poll last
		//es.pollLast();
		
		System.out.println(es);
		
		//add all()
		LinkedList es1=new LinkedList();
		es1.addAll(es);
		System.out.println(es1);
		//clear
		LinkedList es2=new LinkedList();
		es2.clear();
		System.out.println(es2);
		
		//contain
		System.out.println(es.contains("rukku"));
		//remove
		System.out.println(es.remove(0));
		
		//remove last
		//System.out.println(es.removeLast());
		
		//clone-->copying the same data
		System.out.println(es.clone());
		
		//equals-->to check whether two arrays are equal are not
		System.out.println(es.equals(es2));
	
		
		System.out.println(es);
		System.out.println("after adding to first position");
		es.addFirst("cbit");
		System.out.println(es);
		es.addFirst("pdtr");
		
		System.out.println(es.subList(0,2));
	
		
		
			
		
  }

}

package arraylistclass;

import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
public class Iteratelinkedlist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> pv=new LinkedList<String>();
		
		pv.add("cbit");
		pv.add("vbit");
		pv.add("srit");
		pv.add("vits");
		System.out.println(pv);
		
		//foreach
				for(String ss:pv) {
					System.out.println(ss);
				} 
		
		
				//iterator
				System.out.println("after iterator");
				Iterator it=pv.iterator();
				while(it.hasNext()) 
				{
					//System.out.println(it.next());
					if(it.next()=="cbit")
					{
						it.remove();
					}
				}
				System.out.println(pv);
	}

}

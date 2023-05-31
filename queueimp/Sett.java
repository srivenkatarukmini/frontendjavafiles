package queueimp;

import java.util.Iterator;
import java.util.HashSet; 
import java.util.Set;
public class Sett {

	public static void main(String[] args) {
		Set<Integer>mark=new HashSet<Integer>();
		mark.add(45);
		mark.add(55);
		mark.add(65);
		mark.add(65);
		System.out.println(mark);
		Iterator ee=mark.iterator();
		while(ee.hasNext())
		{
			System.out.println(ee.next());
		}
		System.out.println("using remove elements");
		System.out.println(mark.remove(0));
		//removing all elements from set
		mark.removeAll(mark);
		//checking the set is empty are not
		System.out.println(mark.isEmpty());
		
		
		
	}
}

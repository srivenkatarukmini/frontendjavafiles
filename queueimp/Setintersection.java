package queueimp;

import java.util.HashSet;
import java.util.Set;

public class Setintersection {
	
	public static void main(String[] args) {
		Set<Integer>mark=new HashSet<Integer>();
		mark.add(45);
		mark.add(55);
		mark.add(65);
		mark.add(65);
		
		Set<Integer>mark2=new HashSet<Integer>();
		mark2.add(145);                           
		mark2.add(55);
		mark2.add(150);
		mark2.add(165);
		
		//intersection of two sets
		mark.retainAll(mark2);                    //gets similar element in two two sets as output
		System.out.println(mark);
		System.out.println(mark.contains(145));
		System.out.println(mark.size());
		System.out.println(mark.containsAll(mark));
	}

}

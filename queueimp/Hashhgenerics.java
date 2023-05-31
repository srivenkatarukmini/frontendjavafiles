package queueimp;

import java.util.*;


public class Hashhgenerics {
	public static void main(String[] args) {
		
	  //  Map<Integer,Integer> m=new HashMap();                  //hashmap
		
		//Map<Integer,Integer> m=new LinkedHashMap();              //linkedhashmap
	
		Map<Integer,Integer> m=new TreeMap();		               //tree map
		//adding elements to map
		m.put(1,10);
		m.put(5,24);
		m.put(2,60);
		m.put(6,10);
		//traversing map
		Set s=m.entrySet();  //converting to set so that we can traverse
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
		//converting to Mapentry so that we can get key and
		Map.Entry ent=(Map.Entry)itr.next();
		System.out.println(ent.getKey()+" " +ent.getValue());
		    }
	   }

}

package queueimp;

import java.util.*;
public class HAshh {
	public static void main(String[] args) {
		
    Map m=new HashMap();
	//adding elements to map
	m.put(1,"karthik");
	m.put(5,"varun");
	m.put(2,"yashil");
	m.put(6,"karthik");
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














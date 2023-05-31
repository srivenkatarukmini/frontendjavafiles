package arraylistclass;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Listiteratorclass {
	public static void main(String[] args) {
		LinkedList<String> rs=new LinkedList<String>();
		rs.addFirst("cbit");
		rs.add("school");
		rs.add("class");
		rs.add("college");
		System.out.println(rs);
		System.out.println("using list iteration");
		ListIterator rr=rs.listIterator();
		
		while(rr.hasNext())
		{
			System.out.println(rr.next());
		}
		System.out.println("reverse order");
		while(rr.hasPrevious())
		{
			System.out.println(rr.previous());
			System.out.println(rr.previousIndex());
		}
		
		
		
	}

}

package arraylistclass;
import java.util.ArrayList;

public class simplearraylist {

	public static void main(String[] args) {
		ArrayList std=new ArrayList();
		std.add(1);
		std.add("Chandra");
		std.add("CBIT");
		System.out.println(std);
		ArrayList std2=new ArrayList();
		std2.addAll(std);
		System.out.println(std2);
		std2.clear();
		System.out.println(std2);
		System.out.println(std.contains("Chandra"));
		std.remove(1);
		System.out.println(std);
		System.out.println(std.size());
		std.set(1, "Aiesha");
		System.out.println(std);
		System.out.println(std.get(1));
		System.out.println(std.indexOf("Aiesha"));
		System.out.println(std.subList(0,1));
	
		

		
		
		
		

	}

}

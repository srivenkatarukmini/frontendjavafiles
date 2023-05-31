package day7;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("hii");
		System.out.println(s);
		s.append("hello");
		System.out.println(s);
		
		s.insert(5, "there");
		System.out.println(s);
		
		s.delete(5, 11);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
	}
	
}

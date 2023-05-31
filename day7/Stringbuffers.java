package day7;

public class Stringbuffers {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hii");
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

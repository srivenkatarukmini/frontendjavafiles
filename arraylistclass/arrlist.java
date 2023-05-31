package arraylistclass;

import java.util.ArrayList;
import java.util.LinkedList;
public class arrlist {
	public static void main(String[] args) {
		ArrayList num=new ArrayList();
		num.add("First");
		num.add("Second");
		num.add("Third");
		num.add("Random");
		System.out.println("Original ArrayList:"+num);
		num.add("one");
		num.add("two");
		System.out.println("After Copy:"+num.clone());
		}

}

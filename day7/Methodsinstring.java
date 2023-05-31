package day7;
import java.util.Arrays;
public class Methodsinstring {
	public static void main(String[] args) {
		/*String str="Hello Guys";
		int num=str.length();
		System.out.println(str);
		System.out.println(num);*/
		String a="cbit";
		String b="hello";
		int x=a.length();
		System.out.println(x);
		
		System.out.println(a.replace('c','C'));
		
		int index=b.indexOf("o");
		System.out.println(index);
		
		String lower=a.toLowerCase();
		System.out.println(lower);
		
		String up=b.toUpperCase();
		System.out.println(up);
		
		/*String sub=a.substring(3);
		System.out.println(sub);*/
		System.out.println(b.substring(1,3));
		
		/*char ch=a.charAt(3);
		System.out.println(ch);*/
		System.out.println(b.charAt(3));
		String c[]=new String[5];
		c[0]="one";
		c[1]="two";
		c[2]="three";
		System.out.println(Arrays.toString(c));
		
		
		if(a==b)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		
		
		char[] ch=b.toCharArray();
		System.out.println(ch[3]);
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		
		
		
		
	}

}

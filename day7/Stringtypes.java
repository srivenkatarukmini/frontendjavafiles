package day7;

public class Stringtypes {
	public static void main(String[] args) {
	String a="cbit";
	String b="cbit";
	String c=new String("cbit");
	if(a==c)
	{
		System.out.println("Strings are equal(==)");
	}
	else
	{
		System.out.println("Strings are not same(==)");
	}
	if(a.equals(c))
	{
		System.out.println("Strings are equal(equal opr)");
	
	}
	else
	{
		System.out.println("Strings are not equal(equal opr)");
	}
	if(a.equalsIgnoreCase(c))
	{
		System.out.println("both equal(equalIgnoreCase)");
	}
	else
	{
		System.out.println("not equal(equalIgnoreCase)");
	}
	if(a.compareTo(c)>0)
	{
		System.out.println("greater(compareTo)");
	}
	else if(a.compareTo(c)<0)
	{
		System.out.println("lesser(compareTo)");
	}
	else
	{
		System.out.println("both equal(compareTo)");
	}
	System.out.println(a.concat(c));
	String d=a.concat(c);
	System.out.println(d);
		
		
		
	
	
	
	
  }
 }

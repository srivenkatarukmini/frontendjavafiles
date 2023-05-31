package day10;

class psvrd{
	private String name="rukku";
	private int age=20;
	public String getname() {
		return name;
	}
	public int ag() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
}


public class Encapsule {
	public static void main(String[] args) {
		psvrd pr=new psvrd();
		System.out.println(pr.getname());
		System.out.println(pr.ag());
		pr.setage(2);
	}

}

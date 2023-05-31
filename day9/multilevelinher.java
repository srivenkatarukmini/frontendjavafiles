package day9;

class parent1 {
	int age=20;
	public void prin() {
		System.out.println("hi");
	}
}
   class subchild extends parent1 {
	String name="Rukmini";
	public void rcb() {
		System.out.println("hello");
	}
}
 public class multilevelinher extends subchild {
	public static void main(String[] args) {
		multilevelinher re=new multilevelinher();
		re.prin();
		re.rcb();
		System.out.println("my name is "+re.name+" my age is "+re.age);
		
		}

}

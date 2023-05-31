package day11;

interface car{
	 void price();
	void color();
}
interface bike{
	void bprice();
	void bcolor();
	
	}
 abstract class details implements car,bike {

	/*@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("car price is 10000000");
		
	}*/
		
	
	

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("car color is white");
		
	}
	

	@Override
	public void bprice() {
		// TODO Auto-generated method stub
		System.out.println("bike price is 5000000");
		
	}

	@Override
	public void bcolor() {
		// TODO Auto-generated method stub
		System.out.println("bike color is Black");
		
	}
	
}
class dea extends details {
	public void price() {
		System.out.println("car price is 10000000");
	}
}
public class Interface {
	public static void main(String[] args) {
		/*car ca=new details();
		ca.color();
		ca.price();
		bike bi=new details1();
		bi.bprice();
		bi.bcolor();*/
		dea d=new dea();
		d.color();
		d.price();
		d.bcolor();
		d.bprice();
	}

}

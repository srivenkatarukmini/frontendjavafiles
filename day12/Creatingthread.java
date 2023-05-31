package day12;

public class Creatingthread extends Thread {
	
	public void run() {
		//System.out.println("run method");
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"run");
		}
	}
	public static void main(String[] args) {
		
		Creatingthread r=new Creatingthread();
		//r.run();
		r.start();                     //start method invokes the run method and multithreading program start running
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"main");
		}
		//System.out.println("main method");
	}

}

package day12;

public class Multithreadcreate extends Thread {
	public void run() {

		System.out.println("run method "+Thread.currentThread().getPriority());
		System.out.println("run method "+Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		Thread.currentThread().setName("run");
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		Multithreadcreate s=new Multithreadcreate();
		s.start();     
		Thread.currentThread().setName("psvrd");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("main method"+Thread.currentThread().getPriority());
		System.out.println();
		
	}

}

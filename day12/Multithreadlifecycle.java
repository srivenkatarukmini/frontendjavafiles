package day12;

class worker extends Thread{
	public void run() {
		Thread.currentThread().setName("run_method");
		System.out.println("worker thread is running.");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+": run method is alive check: "+isAlive());
		
		System.out.println("worker thread is done.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

					
}
public class Multithreadlifecycle extends Thread {
	
	public static void main(String[] args) {
		worker workerThread=new worker();
		workerThread.start();
		System.out.println("Main thread continues executing");
		try {
			workerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(workerThread.getName()+":run method is alive check: "workerThread
				+isAlive());
		System.out.println("main thread alive: "+Thread.currentThread().isAlive());
		System.out.println("Main Thread is done.");
		Thread.currentThread().stop();
		System.out.println("main thread alive: "+Thread.currentThread().isAlive());
	}
	

}

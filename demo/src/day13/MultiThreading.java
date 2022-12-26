package day13;
class Ppt extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("PPT Thread ID is : "+Thread.currentThread().getId());
		}
	}
}
class Eclipse extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Eclipse Thread ID is : "+Thread.currentThread().getId());
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) {			//first thread
		Ppt p = new Ppt();
		p.setPriority(Thread.MAX_PRIORITY);
		p.start();
		Eclipse e = new Eclipse();
		e.setPriority(Thread.MIN_PRIORITY);
		e.start();
		System.out.println("Main Thread ID is : "+Thread.currentThread().getId());
	}
}

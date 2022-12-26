package day8;

public class Yamaha extends Bike{
	void run(int b, int c) {		//1
		System.out.println(b+" "+c);
		System.out.println("Child method1");
	}
	void run(char d) {				//2
		System.out.println(d);
		System.out.println("Child method2");
	}
	void run(int e, char f) {		//3
		System.out.println(e+" "+f);
		System.out.println("Child method3");
	}
	void run(char f, int e) {		//4
		System.out.println(f+" "+e);
		System.out.println("Child method4");
	}
		
	public static void main(String[] args) {
		Yamaha y = new Yamaha();
		y.run();
		y.run(1);
		y.run('a');
		y.run(1, 1);
		y.run(1, 'a');
		y.run('a', 1);
	}

}

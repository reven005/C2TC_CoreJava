package day8;

public class Bike {
	void run() {			//default method 1
		System.out.println("It is running");
		System.out.println("Parent method1");
	}
	void run(int a) {		//parameterized method 2
		System.out.println(a);
		System.out.println("Parent method2");
	}
	void run(int b, int c) {		//3
		System.out.println(b+" "+c);
		System.out.println("Parent method3");
	}
	void run(char d) {				//4
		System.out.println(d);
		System.out.println("Parent method4");
	}
	void run(int e, char f) {		//5
		System.out.println(e+" "+f);
		System.out.println("Parent method5");
	}
	void run(char f, int e) {		//6
		System.out.println(f+" "+e);
		System.out.println("Parent method6");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();
		b.run(10);
		b.run('z');
		b.run(5,3);
		b.run(5, 'R');
		b.run('R', 3);
		
	}

}

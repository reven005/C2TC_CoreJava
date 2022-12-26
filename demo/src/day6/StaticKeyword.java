package day6;

public class StaticKeyword {
	int roll_no;
	String name;
	static String College_name = "BCE";
	void aa(){
		//static int a = 10;
	}
	static void hi() {
		System.out.println("Hi Everyone");
	}
	public void details(int a, String b, String c) {
		roll_no = a;
		name = b;
	}
	static {
		System.out.println("This is a Static block");
	}
	
	void print() {
		System.out.println(roll_no );
		System.out.println(name);
		System.out.println(College_name);
	}
	
	public static void main(String[] args) {
		System.out.println("This is a main function");
		
		StaticKeyword.hi();
		StaticKeyword s1 = new StaticKeyword();
		s1.details(1, "rrrr", College_name);
		s1.print();
		s1.details(2, "eeee", College_name);
		s1.print();
		
	}

}

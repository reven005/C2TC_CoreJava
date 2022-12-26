package day7;

public class Constructor {
	
	public Constructor(int a) {				//parameterized constructor
		System.out.println("This is a Constructor");
		System.out.println(a);
	}
	public Constructor() {   				//Default constructor
		System.out.println("This is a Constructor");
	}
	public Constructor(char a) {
		System.out.println("This is a Constructor");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor(1);
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor('a');
	}

}

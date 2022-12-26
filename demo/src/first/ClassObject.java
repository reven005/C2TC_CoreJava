package first;

public class ClassObject {
	final int x = 11;
	public void a(){		//method name is a()
		int x = 5;				//integer (variable or attribute is x & value is 5)
		double c = 7.7;
		int y = 6;
		int z = x+y;
		char b = 'a';
		boolean t = true;
		boolean f = false;
		System.out.println(x);		//print statement
	}
	public static void main(String[] args) {
		//object
		ClassObject abc = new ClassObject();			//creating the object
		ClassObject ab = new ClassObject();
		ClassObject a = new ClassObject();
		int x = 10;
		a.a();
		a.a();
		ab.a();
		System.out.println(abc.x);
		System.out.println(x);
		abc.a(); 		//calling the method using object
	}

}

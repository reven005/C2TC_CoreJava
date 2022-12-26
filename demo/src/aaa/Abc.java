package aaa;

public class Abc {
	protected int v = 22;
	private void a() {				//method 1
		System.out.println("Method A");
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
	}
	protected void b()					//method 2
	{
		int a = 10;
		System.out.println("Method B");
		//System.out.println(a);
	}

	public static void main(String[] args) {
		Abc r = new Abc();
		Abc e = new Abc();
		r.a();
		r.b();
		e.a();
		e.b();
		r.a();
		r.b();
	}
}

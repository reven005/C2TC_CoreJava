package day7;

public class This {
	void a(This obj) {
		System.out.println("It was called");
	}
	void b() {
		a(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This s = new This();
		s.b();
	}

}

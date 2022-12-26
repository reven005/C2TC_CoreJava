package day10;

public class Interface1 implements NewInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i = new Interface1();
		i.a();
		i.b();
		i.c();
	}

	@Override
	public void a() {
		System.out.println("Abstract Method A");
	}
	@Override
	public void b() {
		System.out.println("Abstract Method B");
	}
	@Override
	public void c() {
		System.out.println("Abstract Method C");
	}

}

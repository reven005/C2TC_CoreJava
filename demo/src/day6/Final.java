package day6;

final class Final {
	static {
		final int a = 90;
		//a = 100;
	}
	
	
	final void a() {
		int a = 100;
		a = 90;
		System.out.println("This is Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f = new Final();
		f.a();

	}

}

package first;
import aaa.Abc;

class Day3 extends Abc {
	protected int d = 55;
	private void aa() {
		int a = 5;
		System.out.println("Method AA");
	}
	protected void bb() {
		System.out.println("Method BB");
	}
	
	public static void main(String[] args) {
		Day3 obj = new Day3();
		System.out.println(obj.v);
		obj.b();
		
	}

}

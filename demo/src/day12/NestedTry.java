package day12;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				int a = 5/0;
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[3];
				a[4]=5;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}finally {
			System.out.println("I will execute");
		}
		try {
			int a = (Integer) null;
			if(a==5) {
				System.out.println("true");
			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}

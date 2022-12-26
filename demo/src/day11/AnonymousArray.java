package day11;

public class AnonymousArray {
	static void a(int b[]) {
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println(b[7]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a(new int[] {1,2,3,4,5});		//Anonymous array
		

	}

}

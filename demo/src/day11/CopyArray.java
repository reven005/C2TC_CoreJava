package day11;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int b[] = new int[5];
		System.arraycopy(a, 2, b, 0, 5);
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		int c[] = a.clone();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}

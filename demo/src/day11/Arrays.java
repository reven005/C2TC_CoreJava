package day11;

public class Arrays {
	void arr() {
		int b[] = {1,2,3,4,5,6,7,8,9,0};
		//System.out.println(a.length);
		for(int i=1;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = new int[5];		//declaring an array	
		int c[][] = new int [3][3];	//2 dimensional array
		c[0][0] = 1;
		c[0][1] = 1;
		c[0][2] = 1;
		c[1][0] = 1;
		c[1][1] = 1;
		c[1][2] = 1;
		c[2][0] = 1;
		c[2][1] = 1;
		c[2][2] = 1;
		a[0] = 1;					//assigning values to an array (Initialization)
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		//a[5] = 6;
		int b[] = {1,2,3,4,5,6,7,8,9,0};
		//System.out.println(a.length);
		for(int i=1;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
 
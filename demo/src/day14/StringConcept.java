package day14;

public class StringConcept {

	public static void main(String[] args) {
		char a[] = {'a','b','c','d','e'};
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String s = new String(a);		//converting the array into string
		System.out.println(s);
		String str = "Hi Hello BCE Students";		//String Literals
		int c = 10;
		char d = 'a';
		System.out.println(str);
		String num = "1 2 3 4 5 6 7 8 9 0";
		String bool = "true";
		String character = "a";
		String boo = "true";
		String numb = "1";
		num = "1234";
		System.out.println(character);
		System.out.println(bool);
		System.out.println(num);
		String s1 = new String("Welcome");		//String using new keyword
		System.out.println(s1);
		
	}

}

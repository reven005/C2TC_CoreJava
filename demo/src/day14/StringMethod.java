package day14;

public class StringMethod {
	void Charat() {
		String s = "Welcome";
		System.out.println(s.charAt(1));
	}
	void Concat() {
		String s1 = "Welcome ";
		String s2 = "BCE Students";
		System.out.println(s1.concat(s2));
	}
	void Contain() {
		String s1 = "Welcome BCE Students";
		System.out.println(s1.contains("BCE"));
		System.out.println(s1.contains("bce"));
	}
	void EndWith() {
		String s1 = "Welcome BCE Students";
		System.out.println(s1.endsWith("Students"));
		System.out.println(s1.endsWith("Hi"));
		System.out.println(s1.endsWith("s"));
		System.out.println(s1.endsWith("nts"));
	}
	void Equals() {
		String s1 = "Welcome";
		String s2 = "BCE Students";
		String s3 = "Welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equals(s3));
	}
	void EqualsIgnoreCase() {
		String s1 = "Welcome";
		String s2 = "BCE Students";
		String s3 = "Welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase("wElCoMe"));
		System.out.println(s1.equals(s3));
	}
	void IndexOf() {
		String s1 = "Welcome";
		System.out.println(s1.indexOf('W'));
	}
	void Length() {
		String s1 = "Welcome";
		System.out.println(s1.length());
	}
	void ToUpper() {
		String s1 = "Welcome";
		System.out.println(s1.toUpperCase());
	}
	void ToLower() {
		String s1 = "WElcOMe";
		System.out.println(s1.toLowerCase());
	}
	void StartsWith() {
		String s1 = "Welcome BCE Students";
		System.out.println(s1.startsWith("welcome"));
		System.out.println(s1.startsWith("Welcome"));
		System.out.println(s1.startsWith("W"));
		System.out.println(s1.startsWith("Wel"));
	}
	void Replace() {
		String s1 = "Welcome BCE Students BCE";
		System.out.println(s1);
		System.out.println(s1.replace("e", "a"));
	}
	void ReplaceAll() {
		String s1 = "Welcome BCE Students BCE";
		System.out.println(s1);
		System.out.println(s1.replaceAll("e", "a"));
	}
	public static void main(String[] args) {
		StringMethod obj = new StringMethod();
		obj.Replace();
		obj.ReplaceAll();
	}

}

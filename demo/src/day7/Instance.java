package day7;

public class Instance extends This {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance a = new Instance();
		Instance s = new Instance();
		Instance b = null;
		System.out.println(a instanceof Instance);		//object instanceof class
		System.out.println(a instanceof This);
		System.out.println(s instanceof Instance);
		System.out.println(s instanceof This);
		System.out.println(b instanceof Instance);

	}

}

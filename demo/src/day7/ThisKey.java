package day7;

public class ThisKey {
	int roll;
	String name;
	double fee;
	void a() {
		System.out.println("I am method M");
	}
	ThisKey(int roll, String name, double fee){
		this.roll=roll;
		this.name=name;
		this.fee=fee;
		System.out.println("I am a Constructor Method");
	}
	ThisKey(int a){
	}
	void display() {
		System.out.println(roll+" "+name+" "+fee);
		this.a(); //calling method inside a method	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey s1 = new ThisKey(11,"rrr",5000.0);
		ThisKey s2 = new ThisKey(22,"eee",6000.0);
		s1.display();
		s2.display();
	}

}

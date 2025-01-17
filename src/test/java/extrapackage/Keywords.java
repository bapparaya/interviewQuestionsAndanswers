package extrapackage;
class A{
	void animal() {
		System.out.println("it is eating");
	}
}

class B extends A{
	void animal() {
		System.out.println("it barking");
	}
}
class D extends B{
	
	void animal() {
		super.animal();;
		System.out.println("it is bowing");
	}
}


public class Keywords extends B {

	public static void main(String[] args) {
		D c = new D();
		c.animal();

	}

}

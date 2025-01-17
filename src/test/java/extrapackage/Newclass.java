package extrapackage;

class C{
	
	void num(int num) {
		System.out.println(num);
	}
}



public class Newclass extends C {

	void num(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Newclass nc = new Newclass();
		nc.num(10);

	}

}

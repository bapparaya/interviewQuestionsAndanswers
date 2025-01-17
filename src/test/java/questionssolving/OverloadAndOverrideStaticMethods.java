package questionssolving;

public class OverloadAndOverrideStaticMethods extends A  {

	public static void display(String name) {
		System.out.println("this is overiden method "+ name);
	}
	
	public void show(String name) {
		System.out.println("this is overriden non static method");
	}
	
public static void main(String args[]) {
	A.display("bappa");
	display("bappa");
	display("bappa", 101);
	A obj= new A();
	obj.show("muthu");
	obj.show("muthu", 102);
	OverloadAndOverrideStaticMethods obj2 = new OverloadAndOverrideStaticMethods();
	obj2.show("muthu");
}



}

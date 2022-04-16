package Unit_02;

public class P11_Task01_AcessProtectionInJava {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();

	}

}

class ParentClass {
	
	int a = 10; //default protection!
	public int b = 20; //can be accessed outside Unit_02 Package but same project
	protected int c = 30; //can be accessed within Unit_02 Package 
	private int d = 40; //wit
	
	void showData() {
System.out.println("Inside Parent Class");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
	
}

class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		System.out.println("d = " + d);             //      Private Members cannot be accessed
	}
}

class AnotherClass{
	void display() {
		
		ParentClass obj = new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	}
}
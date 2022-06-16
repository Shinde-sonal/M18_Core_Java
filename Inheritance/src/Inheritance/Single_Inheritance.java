package Inheritance;

class Parent{
	void bike() {
		System.out.println("HERO");
	}
}
class Child extends Parent{
	void cycle() {
		System.out.println("Atluse");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.bike();
		c.cycle();
	}

}

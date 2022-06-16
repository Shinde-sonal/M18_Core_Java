package constructor;

public class constructor_demo_example {
	int value1;
	int value2;
	constructor_demo_example()
	{
		value1 = 10;
		value2 = 20;
		System.out.println("Inside Constructor.");
	}
	public void display() {
		System.out.println("value1===" + value1);
		System.out.println("value2===" + value2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_demo_example d1 = new constructor_demo_example();
		d1.display();
	}

}

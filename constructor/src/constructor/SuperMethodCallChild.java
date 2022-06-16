package constructor;

public class SuperMethodCallChild extends  SuperMethodCallParent{
	void display() {
		 System.out.println("Child class method.");
	 }
	 void printmsg() {
		 //This would call overriding method.
		 display();
		 //This would call overridden method.
		 super.display();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodCallChild obj = new SuperMethodCallChild();
		 obj.printmsg();
	}

}

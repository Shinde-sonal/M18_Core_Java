package constructor;

public class SuperVariableChild extends SuperVariableParent{
	int num = 110;
	
	  void printNumber() {
		 //Super.variable_name.
		 System.out.println(super.num);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		 obj.printNumber();
	}

}

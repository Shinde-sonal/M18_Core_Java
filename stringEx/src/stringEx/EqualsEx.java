package stringEx;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="sonal shinde";
		String s2 ="sonal shinde";
		String s3 ="SONAL SHINDE";
		String s4 ="corejava";
		
		System.out.println(s1.equals(s2));
		//true because content and case are same.
		
		System.out.println(s1.equals(s3));
		//false because case is not same.
		
		System.out.println(s1.equals(s4));
		//false because content is different.
		
	}

}

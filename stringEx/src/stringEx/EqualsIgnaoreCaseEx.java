package stringEx;

public class EqualsIgnaoreCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sonalshinde";
		String s2 = "sonalshinde";
		String s3 = "SONALSHINDE";
		String s4 = "corejava";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		//true because content case both are same.
		
		System.out.println(s1.equalsIgnoreCase(s3));
		//true because content case is ignored.
		
		System.out.println(s1.equalsIgnoreCase(s4));
		//false because content is not same.
	}

}

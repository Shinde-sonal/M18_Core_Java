package homework_assesment;
import java.util.Scanner;
public class CalcBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long units;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of units");
		units = sc.nextLong();
		double billpay=0;
		
		if(units<100)
			billpay=units*8;
		
		else if(units<300)
			billpay=100*8+(units-100)*2;
		
		else if(units>300)
		
			billpay=100*8+200*2+(units-300)*3;
		
		System.out.println("Bill to pay in Rs. :"+billpay);
	}

}

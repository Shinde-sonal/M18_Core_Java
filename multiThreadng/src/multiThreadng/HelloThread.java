package multiThreadng;

public class HelloThread extends Thread{
public void run() {
		
		System.out.println("Hello...Welcome to Capgemini.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloThread().start();
	}

}

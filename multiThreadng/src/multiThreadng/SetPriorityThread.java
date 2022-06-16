package multiThreadng;

public class SetPriorityThread extends Thread{

		public void run() {
			 System.out.println("Thread "+ Thread.currentThread().getName()+ " started");
			 System.out.println("Thread with priority "+ Thread.currentThread().getPriority()+ " is runnig");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetPriorityThread t1 = new SetPriorityThread();
		SetPriorityThread t2 = new SetPriorityThread();
		SetPriorityThread t3 = new SetPriorityThread();
		
		t1.setPriority(3);
		t2.setPriority(9);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

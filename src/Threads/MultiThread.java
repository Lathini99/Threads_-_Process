package Threads;

public class MultiThread extends Thread{
	private int thread_number;
	
	public MultiThread(int t) {
		this.thread_number = t;
	}
	
 	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(i + " from Thread : "+ thread_number);
			
			if(thread_number == 2) {
				throw new RuntimeException();
			}
			
			
			try 
			{
				Thread.sleep(1000); //1000ms =1s
				
			} 
			catch (InterruptedException e) 
			{
				
			} 
		}
		
	}

}

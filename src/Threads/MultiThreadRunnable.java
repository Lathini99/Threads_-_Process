package Threads;

public class MultiThreadRunnable implements Runnable{
// we can extend to any other class or interface but we cannot do that in thread class. 
    private int thread_number;
	
	public MultiThreadRunnable(int t) {
		this.thread_number = t;
	}
	
 	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(i + " from Thread : "+ thread_number);
			
			/*if(thread_number == 2) {
				throw new RuntimeException();
			}*/
			
			
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

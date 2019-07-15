package main;


public class MyThread implements Runnable   {
	
	boolean stopped=false;

	Thread thrd;
	// Construct a new thread.
	public MyThread(String string) {
		
		
		thrd = new Thread(this , string);
		thrd.start(); 
	
}
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
	try {
		

		
		while(!stopped) {
			System.out.println(Lights.GREEN.getCommand());
			Thread.sleep(5000);	
			System.out.println("\n");
			
			System.out.println(Lights.YELLOW.getCommand());
			Thread.sleep(2000);	
			System.out.println("\n");
			
			System.out.println(Lights.RED.getCommand());
			Thread.sleep(3000);	
			System.out.println("\n");
		
			
		}
	
	}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		
	}
	
	}
	
	 synchronized void mystop() {
	        stopped = true;
	        notifyAll();
	        System.exit(0);
	    }
	

}
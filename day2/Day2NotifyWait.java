package CoreJava;

public class Day2NotifyWait {
	
	    public static void main(String[] args)
	    {
	        System.out.println("Main thread started ");

	        ThreadA threadA = new ThreadA(10);
	        threadA.start();
	        System.out.println("ThreadA was started");

	        synchronized (threadA)
	        {
	            try {
	                System.out.println("Main thread is waiting for ThreadA ");
	                threadA.wait();
	                System.out.println("Main thread resumed and factorial is="+threadA.fact);
	            } catch (InterruptedException e) {
	                System.out.println("exception");
	            }
	        }

	        System.out.println("Main thread completed ");
	    }
	}


	class ThreadA extends Thread
	{
		int n=0;
		int fact=1;
		public ThreadA(int n) {
			this.n=n;
		}
		
	    public void run()
	    {
	    	synchronized (this) {
	    		
			for(int i=1;i<=n;i++)
				fact=fact*i;
			
			}
	    	
	    }
	   }
	
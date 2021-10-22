package CoreJava;

import javax.management.RuntimeErrorException;

class MyThread extends Thread{
	int n;
	public MyThread(int n) {
		this.n=n;
	}
	   public void run(){
	     
	      int fact=1;
	      
	      for(int i=1;i<=10;i++)
	      {
	    	fact =fact*n;
	    	System.out.println(fact);
	    	if(fact==1410065408)
	    	{
	    		throw new RuntimeException();
	    	}	
	    	
	      }
	   }
	}
public class MultipleThread
{

	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t1 = new MyThread(10);
		MyThread t2 = new MyThread(8);
		MyThread t3 = new MyThread(2);
	      t1.start();
	      t2.start();
	      try {
			Thread.sleep(22);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      t3.start();
	      
	      t2.join();
	      
	try {
        
     } catch (Exception x) {
        System.out.println("Caught it" + x);
     }
     System.out.println("Exiting main");
  }
}

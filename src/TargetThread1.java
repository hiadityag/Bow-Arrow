
public class TargetThread1 extends Thread
{

	public void run() 
	{
     try
     {
    	 while (true) 
    	 {
    		     	int x=level2.target1.getX();
    		     	if(x==400)
   	    			 x=0;

    		     	level2.target1.setBounds(x+10, 30, 100, 20);
    	Thread.sleep(100);
			
	   	 }
     }
     catch(Exception e){}
	}

}

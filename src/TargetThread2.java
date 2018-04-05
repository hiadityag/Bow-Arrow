
public class TargetThread2 extends Thread
{

	public void run() 
	{
     try
     {
    	 while (true) 
    	 {
    		     	int x=level2.target2.getX();
    		     	if(x==400)
   	    			 x=0;

    		     	level2.target2.setBounds(x+10, 80, 100, 20);
    	Thread.sleep(80);
			
	   	 }
     }
     catch(Exception e){}
	}

}

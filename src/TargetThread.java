
public class TargetThread extends Thread
{

	public void run() 
	{
     try
     {
    	 while (true) 
    	 {
    		     	int x=Mygame.target.getX();
    		     	if(x==400)
   	    			 x=0;

    		     	Mygame.target.setBounds(x+10, 30, 100, 20);
    	Thread.sleep(100);
			
	   	 }
     }
     catch(Exception e){}
	}

}

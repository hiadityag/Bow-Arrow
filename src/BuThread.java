
public class BuThread extends Thread
{
public void run() 
{
try
{
	for(int i=350;i>=0;i-=10)
	{
		Mygame.bu.setBounds(195, i, 10, 10);
		 Thread.sleep(10);     	
	 
}
}catch(Exception e){}
}

}

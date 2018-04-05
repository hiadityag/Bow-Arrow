
public class BuThread2 extends Thread
{
public void run() 
{
try
{
	for(int i=350;i>=0;i-=10)
	{
		level2.bu.setBounds(195, i, 10, 10);
		 Thread.sleep(10);     	
	 
}
}catch(Exception e){}
}

}

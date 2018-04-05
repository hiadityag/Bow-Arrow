
public class scrcnt extends Thread 
{
	static int x,y,cnt=0;
public void run()
{
	try
	{
	while (true) 
	{
		x=Mygame.target.getX();
		y=Mygame.bu.getY();
		 if(((x>=100)&&(x<=200))&&(y==50))
				{
			cnt++;
		    Mygame.t1.setText(""+cnt);
	            }	
		 if(Mygame.t1.getText().equals("10"))
		 {
			 Mygame.tt.stop();
			 /*	Mygame.bt.stop();
				Mygame.sc.stop(); */
				Mygame.tf.stop();
        		
				break;
		 }
		Thread.sleep(10);
	}	
}catch(Exception e){}
	level2 bj=new level2();

}
}

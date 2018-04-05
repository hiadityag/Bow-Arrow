import javax.swing.JOptionPane;


public class scrcnt2 extends Thread 
{
	static int x1,x2,y,cnt=0;
public void run()
{
	try
	{
	while (true) 
	{
		x1=level2.target1.getX();
		x2=level2.target2.getX();
		y=level2.bu.getY();
		if(((((x1>=100)&&(x1<=200))&&(y==50)))||(((x2>=100)&&(x2<=200))&&(y==100)))
		{
	cnt++;
    level2.t1.setText(""+cnt);
        }	
		if(level2.t1.getText().equals("30"))
		{
			JOptionPane.showMessageDialog(null, "YOU WON");
			level2.tt1.stop();
			level2.tt2.stop();
			level2.tf.stop();
			break;	
		}
Thread.sleep(10);
	}	
}catch(Exception e){}
}
}

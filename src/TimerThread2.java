import javax.swing.JOptionPane;


public class TimerThread2 extends Thread
{
	public void run() 
	{
try
{
	for (int i = 30; i >= 0; i--) 
	{
	level2.t.setText(""+i);
	Thread.sleep(1000);
	}
	game0vr1 gv=new game0vr1();
	JOptionPane.showMessageDialog(null, "YOU LOSE");
	level2.tt1.stop();
	level2.tt2.stop();
	level2.sc.stop();
	
}
catch(Exception e)
{}
	}

}

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class TimerThread extends Thread
{
	static int i;
	public void run() 
	{
try
{
	for ( i = 30; i >= 0; i--) 
	{
	Mygame.t.setText(""+i);
	Thread.sleep(1000);
	}	
	game0vr gv=new game0vr();
	JOptionPane.showMessageDialog(null, "YOU LOSE");
	Mygame.tt.stop();
	Mygame.bt.stop();
	Mygame.sc.stop();
	}
catch(Exception e)
{}

}

}

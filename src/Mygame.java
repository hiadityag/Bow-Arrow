import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
public class Mygame 
{
	static scrcnt sc;
	static BuThread bt;
	static Mygame g;
	static TargetThread tt;
	static TimerThread tf;
static Frame f;
static Button target,tank,bu;
static Label t,t1;
public Mygame() 
	{
	f=new Frame("MYGAME-LEVEL 1");
	target=new Button();
	tank=new Button();
	bu=new Button();
	t=new Label("30");
	t1=new Label("0");
	
	f.setLayout(null);
	tank.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
		 bt=new BuThread();	
		bt.start();
		}
	});
	target.setBounds(0, 30, 100, 20);
	tank.setBounds(180, 360, 40, 40);
	bu.setBounds(195, 350, 10, 10);
	t.setBounds(360, 360, 40, 40);
	t1.setBounds(20, 360, 40, 40);
	
	target.setBackground(Color.BLUE);
	tank.setBackground(Color.MAGENTA);
	bu.setBackground(Color.RED);
	
	t.setBackground(Color.GREEN);
	t1.setBackground(Color.GREEN);
	t.setForeground(Color.BLACK);
	t1.setForeground(Color.BLACK);

	f.setBackground(Color.GRAY);
	f.add(target);
	f.add(tank);
	f.add(t);
	f.add(t1);
	f.add(bu);
	f.setSize(400, 400);
	f.setVisible(true);
    f.setResizable(false);
	
	 tt=new TargetThread();
	tt.start();
	tf=new TimerThread();
	tf.start();
     sc=new scrcnt();
    sc.start();
	}

	public static void main(String[] args) 
	{
	 g=new Mygame();

	}

}

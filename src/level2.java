import java.awt.*;
import java.awt.event.*;
public class level2 
{
	static level2 g;
	static TargetThread1 tt1;static TargetThread2 tt2;	
static TimerThread2 tf;
static scrcnt2 sc;	
static Frame f;
static Button target1,target2,tank,bu;
static Label t,t1;
public level2() 
	{
	f=new Frame("MYGAME-LEVEL 2");
	target1=new Button();
	target2=new Button();
	tank=new Button();
	bu=new Button();
	t=new Label("30");
	t1=new Label("0");
	
	f.setLayout(null);
	tank.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
		BuThread2 bt1=new BuThread2();	
		bt1.start();
		}
	});
	target1.setBounds(0, 30, 100, 20);
	target2.setBounds(0, 80, 100, 20);
	tank.setBounds(180, 360, 40, 40);
	bu.setBounds(195, 350, 10, 10);
	t.setBounds(360, 360, 40, 40);
	t1.setBounds(20, 360, 40, 40);
	
	target1.setBackground(Color.BLUE);
	target2.setBackground(Color.BLUE);
	tank.setBackground(Color.MAGENTA);
	bu.setBackground(Color.RED);
	
	t.setBackground(Color.GREEN);
	t1.setBackground(Color.GREEN);
	t.setForeground(Color.BLACK);
	t1.setForeground(Color.BLACK);

	f.setBackground(Color.GRAY);

	f.add(target1);
	f.add(target2);
	f.add(tank);
	f.add(t);
	f.add(t1);
	f.add(bu);
	f.setSize(400, 400);
	f.setVisible(true);
	
	tt1=new TargetThread1();
	tt1.start();
	 tt2=new TargetThread2();
	tt2.start();
    tf=new TimerThread2();
	tf.start();
    sc=new scrcnt2();
    sc.start();
	}

}

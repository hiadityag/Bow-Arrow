import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class game0vr1 {
JFrame f;
JLabel a;
JButton b1,b2;
	public game0vr1() 
	{
	f=new JFrame("GAME OVER");
	b1=new JButton("Get Score");
	b2=new JButton("Play Again");
    a=new JLabel();
	b1.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
	String s=level2.t1.getText();
			a.setText(s);
		}
	});
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			level2.t1.setText("0");
	level2.g=new level2();
			
		}
	});
	f.setLayout(new GridLayout(3, 1));
	 f.add(b1);
	 f.add(a);
	 f.add(b2);
	 f.setSize(400, 400);
	 f.setResizable(false);
	 f.setVisible(true);
	}
   public static void main(String ar[])
   {
	game0vr1 gb=new game0vr1();
	
   }
}

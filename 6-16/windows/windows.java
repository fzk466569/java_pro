package windows;

import java.awt.*;
import javax.swing.*;

public class windows extends JFrame
{
	JButton jb1=null;
	public static void main(String[] args)
	{
		windows win = new windows();
	}
	public windows()
	{
		jb1=new JButton("Ã·Ωª∞¥≈•");
		this.add(jb1);
		this.setSize(400, 300);
		this.setLocation(800,400);
		this.setTitle("hello world!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

package windows;

import java.awt.*;
import javax.swing.*;

public class Demo1 extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args)
	{
		Demo1 demo1=new Demo1();
	}
	
	public Demo1()
	{
		jb1=new JButton("mid");
		jb2=new JButton("up");
		jb3=new JButton("left");
		jb4=new JButton("right");
		jb5=new JButton("down");
		
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb4, BorderLayout.EAST);
		this.add(jb5, BorderLayout.SOUTH);
		this.add(jb3, BorderLayout.WEST);
		
		this.setTitle("边界布局案例");
		this.setSize(400, 300);
		this.setLocation(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

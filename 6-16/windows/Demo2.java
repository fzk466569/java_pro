package windows;

import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args)
	{
		Demo2 demo2=new Demo2();
	}
	
	public Demo2()
	{
		jb1=new JButton("1");
		jb2=new JButton("2");
		jb3=new JButton("3");
		jb4=new JButton("4");
		jb5=new JButton("5");
		jb6=new JButton("6");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		this.setTitle("流式布局案例");
		this.setSize(400, 300);
		this.setLocation(800, 400);
		
		//禁止任意改变窗体大小
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

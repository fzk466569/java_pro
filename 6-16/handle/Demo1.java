package handle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo1 extends JFrame implements ActionListener
{
	JPanel mp=null;
	JButton jb1,jb2=null;
	public static void main(String[] args) 
	{
		Demo1 demo=new Demo1();
	}
	
	public Demo1()
	{
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		Cat cat1=new Cat();
		//注册监听
		jb1.addActionListener(this);
		jb1.addActionListener(cat1);
		jb1.setActionCommand("黑色");
		
		jb2.addActionListener(this);
		jb2.addActionListener(cat1);
		jb2.setActionCommand("红色");
		
		this.setSize(400,300);
		this.setLocation(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("黑色"))
		{
			System.out.println("你点击了黑色按钮");
			mp.setBackground(Color.BLACK);
		}
		else if(e.getActionCommand().equals("红色"))
		{
			System.out.println("你点击了红色按钮");
			mp.setBackground(Color.red);
		}
	}
}
/*
class MyPanel extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		
	}
}
*/

class Cat implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("黑色"))
		{
			System.out.println("猫都知道你点了黑色");
		}
		else if(arg0.getActionCommand().equals("红色"))
		{
			System.out.println("猫都知道你点了红色");
		}
		
	}
	
}





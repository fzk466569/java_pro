package windows;

import java.awt.*;
import javax.swing.*;

public class Demo4 extends JFrame
{
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args)
	{
		Demo4 demo4=new Demo4();
	}
	
	public Demo4()
	{
		//创建组件
		//JPanel布局默认为流式
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("1");
		jb2=new JButton("2");
		jb3=new JButton("3");
		jb4=new JButton("4");
		jb5=new JButton("5");
		jb6=new JButton("6");
		
		//添加组件
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//把Panel加入JFrame
		this.add(jb1, BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setLocation(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
		
	}
}
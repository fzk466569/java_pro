package windows;

import java.awt.*;
import javax.swing.*;

public class Demo5 extends JFrame
{
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpf1;
	
	public static void main(String[] args)
	{
		Demo5 demo5=new Demo5();
	}
	
	public Demo5()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("user:");
		jl2=new JLabel("password:");
		
		jb1=new JButton("login");
		jb2=new JButton("cancel");
		
		jtf1=new JTextField(10);
		jpf1=new JPasswordField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//加入各个组件
		jp1.add(jl1);
		jp1.add(jtf1);
		
		jp2.add(jl2);
		jp2.add(jpf1);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 400);
		this.setVisible(true);
		
	}
}

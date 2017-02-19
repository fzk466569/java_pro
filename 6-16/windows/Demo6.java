package windows;

import java.awt.*;
import javax.swing.*;

public class Demo6 extends JFrame
{
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;
	
	public static void main(String[] args)
	{
		Demo6 demo6=new Demo6();
	}
	
	public Demo6()
	{
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("喜欢的运动");
		jl2=new JLabel("性别");
		
		jb1=new JButton("注册");
		jb2=new JButton("取消注册");
		
		jcb1=new JCheckBox("足球");
		jcb1=new JCheckBox("篮球");
		jcb1=new JCheckBox("网球");
		
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);

		//设置布局
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setVisible(true);
		this.setSize(400, 300);
		this.setLocation(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

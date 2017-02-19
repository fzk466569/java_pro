package GUI;

import java.awt.*;
import javax.swing.*;

public class Demo3 extends JFrame
{
	MyPanel mp=null;
	public static void main(String [] args)
	{
		Demo3 demo3=new Demo3();
	}
	
	public Demo3()
	{
		mp=new MyPanel();
		
		this.add(mp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(800,400);
	}
}

//定义MyPanel
class MyPanel extends JPanel
{
	//覆盖JPanel里的paint方法
	//Graphics是绘图的重要类，可以理解为画笔
	public void paint(Graphics g)
	{
		//调用父类函数完成初始化任务
		super.paint(g);
		//g.drawOval(10, 10, 30, 30);
		//g.drawLine(10, 10, 20, 200);
		//填充矩形
		//g.draw3DRect(20, 20, 40, 40, raised);
		//g.drawRect(10, 10, 20, 30);
		//g.setColor(Color.BLUE);
		//g.fillRect(50, 50, 40, 200);
		//g.setColor(Color.yellow);
		//g.fillRect(10, 10, 20, 20);
		
		//在面板上画出图片
//		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/Image/teacher.jpg"));
//		g.drawImage(im, 0, 0, 200, 200, this);
		//如何画出字
//		g.setColor(Color.GREEN);
//		g.setFont(new Font("仿宋",Font.BOLD,30));
//		g.drawString("樊志魁", 110, 110);
		//画弧线
		//g.drawArc(100, 100, 120, 300, 10, 100);

		
		
		
		
		
		
		
		
		
	}
}
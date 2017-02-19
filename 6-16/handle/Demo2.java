package handle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo2 extends JFrame
{
	MyPanel mp=null;
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Demo2 demo2=new Demo2();
	}
	
	public Demo2()
	{
		mp=new MyPanel();
		this.add(mp);
		
		this.addKeyListener(mp);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800,400);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel implements KeyListener
{
	int x=10;
	int y=10;
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.fillOval(x, y, 10, 10);
	}

	public void keyTyped(KeyEvent e) 
	{
		System.out.println("Typed");
	}

	public void keyPressed(KeyEvent e) 
	{
		//System.out.println("Pressed"+e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			this.repaint();
			y++;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			this.repaint();
			y--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			this.repaint();
			x--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			this.repaint();
			x++;
		}
		//调用repaint函数，来重绘界面
		
	}

	public void keyReleased(KeyEvent e) 
	{
		System.out.println("Released");
	}
}

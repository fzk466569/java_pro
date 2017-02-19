package handle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo3 extends JFrame 
{

	MyPanel1 mp=null;
	
	public static void main(String[] args) 
	{

		Demo3 demo3=new Demo3();
	}
	
	public Demo3()
	{
		mp=new MyPanel1();
		
		this.add(mp);
		
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 400);
		this.setVisible(true);
		
	}
}

class MyPanel1 extends JPanel implements MouseListener,KeyListener,MouseMotionListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
	}

	//点击
	public void mouseClicked(MouseEvent e) {
		System.out.println("鼠标点击了X="+e.getX()+"Y="+e.getY());
		
	}

	//按着
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//释放
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//移动到
	public void mouseEntered(MouseEvent e) {
		System.out.println("鼠标来了");
		
	}

	//离开
	public void mouseExited(MouseEvent e) {
		System.out.println("鼠标走了");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("按下的键为"+e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//System.out.print("鼠标当前坐标为X="+e.getX()+"Y="+e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("鼠标当前坐标为X="+e.getX()+"Y="+e.getY());
	}
}

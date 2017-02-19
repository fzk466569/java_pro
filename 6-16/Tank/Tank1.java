package Tank;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Tank1 extends JFrame
{
	MyPanel mp=null;
	public static void main(String[] args) 
	{
		Tank1 tank=new Tank1();
	}
	
	public Tank1()
	{
		mp=new MyPanel();
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(800,600);
		this.setLocation(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}

//�ҵ����
class MyPanel extends JPanel implements KeyListener
{
	//����һ���ҵ�̹��
	Hero hero=null;
	//���캯��
	//������˵�̹����
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	
	int enSize=10;
	public MyPanel()
	{
		hero=new Hero(400,400);
		
		//��ʼ������̹��
		for(int i=0;i<enSize;i++)
		{
			//����һ�����˵�̹�˶���
			
			EnemyTank et=new EnemyTank((i+1)*100,0);
			et.setColor(1);
			et.setDirect(2);
			ets.add(et);
		}
	}
	//����paint
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillRect(0, 0, 800, 600);
		
		//�����Լ���̹��
		this.drawTank(hero.getX(), hero.getY(), g, hero.direct, 1,hero.speed);
		
		//�����ط���̹��
		for(int i=0;i<ets.size();i++)
		{
			this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(),0 , 1);
		}
	}
	
	//����̹�˵ĺ���
  	public void drawTank(int x,int y,Graphics g,int direct,int type,int speed)
	{
		switch(type)
		{
			case 0:
				g.setColor(Color.red);
				break;
			case 1:
				g.setColor(Color.yellow);
				break;
		}
		
		switch(direct)
		{
		case 0:
			g.fillRect(x, y, 10, 50);
			g.fillRect(x+35, y, 10, 50);
			g.fill3DRect(x+10, y+10, 25, 33,false);
			g.drawOval(x+14, y+18, 15, 15);
			g.drawLine(x+22, y-5, x+22, y+25);
			break;
		case 1:
			g.fillRect(x, y, 50, 10);
			g.fillRect(x, y+35, 50, 10);
			g.fill3DRect(x+10, y+10, 33, 25, false);
			g.drawOval(x+18, y+14, 15, 15);
			g.drawLine(x+55, y+22, x+25, y+22);
			break;
		case 2:
			g.fillRect(x, y, 10, 50);
			g.fillRect(x+35, y, 10, 50);
			g.fill3DRect(x+10, y+10, 25, 33,false);
			g.drawOval(x+14, y+18, 15, 15);
			g.drawLine(x+22, y+55, x+22, y+25);
			break;
		case 3:
			g.fillRect(x, y, 50, 10);
			g.fillRect(x, y+35, 50, 10);
			g.fill3DRect(x+10, y+10, 33, 25, false);
			g.drawOval(x+18, y+14, 15, 15);
			g.drawLine(x-5, y+22, x+25, y+22);
			break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W)
		{
			//�����ҵ�̹�˵ķ���
			this.hero.setDirect(0);
			this.hero.moveUp();
			System.out.println("�㰴�µ���W");
		}
		else if(e.getKeyCode()==KeyEvent.VK_D)
		{
			this.hero.setDirect(1);
			this.hero.moveRight();
			System.out.println("�㰴�µ���D");
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		{
			this.hero.setDirect(2);
			this.hero.moveDown();
			System.out.println("�㰴�µ���S");
		}
		else if(e.getKeyCode()==KeyEvent.VK_A)
		{
			this.hero.setDirect(3);
			this.hero.moveLeft();
			System.out.println("�㰴�µ���A");
		}
		//�ػ�Panel
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}




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
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		Cat cat1=new Cat();
		//ע�����
		jb1.addActionListener(this);
		jb1.addActionListener(cat1);
		jb1.setActionCommand("��ɫ");
		
		jb2.addActionListener(this);
		jb2.addActionListener(cat1);
		jb2.setActionCommand("��ɫ");
		
		this.setSize(400,300);
		this.setLocation(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	//���¼�����ķ���
	public void actionPerformed(ActionEvent e) {
		//�ж����ĸ���ť�����
		if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("�����˺�ɫ��ť");
			mp.setBackground(Color.BLACK);
		}
		else if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("�����˺�ɫ��ť");
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
		if(arg0.getActionCommand().equals("��ɫ"))
		{
			System.out.println("è��֪������˺�ɫ");
		}
		else if(arg0.getActionCommand().equals("��ɫ"))
		{
			System.out.println("è��֪������˺�ɫ");
		}
		
	}
	
}





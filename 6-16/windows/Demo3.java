package windows;

import java.awt.*;
import javax.swing.*;

public class Demo3 extends JFrame
{
	int size=9;
	JButton jbs[]=new JButton[size];
	public static void main(String[] args)
	{
		Demo3 demo3=new Demo3();
	}

	public Demo3()
	{
		for(int i=0;i<size;i++)
		{
			jbs[i]=new JButton(String.valueOf(i));
		}
		//�������񲼾�3��3��
		this.setLayout(new GridLayout(3,3,10,10));
		
		for(int i=0;i<size;i++)
		{
			this.add(jbs[i]);
		}
		
		//���ô�������
		this.setTitle("���񲼾ְ���");
		this.setSize(400,300);
		this.setLocation(800, 400);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

package GUI;

import java.awt.*;
import javax.swing.*;

public class Demo1 extends JFrame 
{
	JSplitPane jsp;
	JList jlist;
	JLabel jl;
	public static void main(String[] args)
	{
		Demo1 demo1=new Demo1();
	}
	
	public Demo1()
	{
		String words[]={"boy","girl","bird"};
		jlist=new JList(words);
		
		jl=new JLabel(new ImageIcon("Image/idf_game_stege_059.jpg"));
		
		//��ִ���
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl);
		//���ÿ�����������
		jsp.setOneTouchExpandable(true);
		//���ò��ֹ�����
		
		//������
		this.add(jsp);
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setLocation(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

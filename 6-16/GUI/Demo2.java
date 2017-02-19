package GUI;

import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame
{
	JTextArea jta=null;
	JScrollPane jsp=null;
	JPanel jp1=null;
	JComboBox jcb=null;
	JTextField jtf=null;
	JButton jb=null;
	
	public static void main(String[] args)
	{
		Demo2 demo2=new Demo2();
	}
	
	public Demo2()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jp1=new JPanel();
		
		String chatter[]={"A","B","C"};
		jcb=new JComboBox(chatter);
		
		jtf=new JTextField(10);
		jb=new JButton("send");
		
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setIconImage(new ImageIcon(("Image/teacher.jpg")).getImage());
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 400);
		this.setVisible(true);

	}
}

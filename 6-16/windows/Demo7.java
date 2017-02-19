package windows;

import java.awt.*;
import javax.swing.*;

public class Demo7 extends JFrame
{
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jcb;
	JList jlist;
	JScrollPane jsp;

	public static void main(String[] args)
	{
		Demo7 demo7=new Demo7();
	}
	
	public Demo7()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("籍贯");
		jl2=new JLabel("旅游地点");
		
		String jg[]={"北京","山西","上海","天津","火星"};
		jcb=new JComboBox(jg);
		
		String dd[]={"厕所","教室","茅房","长城","召唤师峡谷"};
		jlist=new JList(dd);
		jlist.setVisibleRowCount(3);
		jsp=new JScrollPane(jlist);
		
		
		this.setLayout(new GridLayout(3,1));
		
		jp1.add(jl1);
		jp1.add(jcb);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		this.setSize(400, 300);
		this.setLocation(800,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

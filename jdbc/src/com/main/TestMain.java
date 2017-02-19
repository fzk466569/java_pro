package com.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.bean.Student;
import com.dao.StudentDAO;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StudentDAO sd=new StudentDAO();
		while(true){
			System.out.println("1���鿴ѧ����Ϣ 2�����ѧ�� 3��ɾ��ѧ�� 4���˳�");
			int a=sc.nextInt();
			switch(a){
			case 1:
				ArrayList<Student> al = sd.getListAll();
				System.out.println("ѧ��\t����\t�Ա�");
				for (Student s : al) {
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getType());
				}
				break;
			case 2:
				System.out.print("������ѧ������ �Ա� (1���У�2��Ů ) ����");
				Student s=new Student();
				s.setName(sc.next());
				s.setGander(sc.nextInt());
				s.setAge(sc.nextInt());
				if(sd.insert(s))
				{
					System.out.println("����ɹ�");
				}else{
					System.out.println("����ʧ��");
				}
				break;
			case 3:
				System.out.println("������Ҫɾ����ѧ�����");
				int id=sc.nextInt();
				boolean b=sd.delete(id);
				if(b)
				{
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 4:
				System.exit(0);
			}
			
		}
	}

}

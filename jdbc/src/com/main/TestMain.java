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
			System.out.println("1、查看学生信息 2、添加学生 3、删除学生 4、退出");
			int a=sc.nextInt();
			switch(a){
			case 1:
				ArrayList<Student> al = sd.getListAll();
				System.out.println("学号\t姓名\t性别");
				for (Student s : al) {
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getType());
				}
				break;
			case 2:
				System.out.print("请输入学生姓名 性别 (1：男，2：女 ) 年龄");
				Student s=new Student();
				s.setName(sc.next());
				s.setGander(sc.nextInt());
				s.setAge(sc.nextInt());
				if(sd.insert(s))
				{
					System.out.println("插入成功");
				}else{
					System.out.println("插入失败");
				}
				break;
			case 3:
				System.out.println("请输入要删除的学生编号");
				int id=sc.nextInt();
				boolean b=sd.delete(id);
				if(b)
				{
					System.out.println("删除成功");
				}else{
					System.out.println("删除失败");
				}
				break;
			case 4:
				System.exit(0);
			}
			
		}
	}

}

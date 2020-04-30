package com.gemptc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HomeWork {
 
 
	List<Student> list;
 
 
	public HomeWork() {
		list = new ArrayList<>();
	}
 
 
	// 显示菜单信息
	public void show() {
		System.out.println("******************************");
		System.out.println("|     1.插入       | ");
		System.out.println("|     2. 显示学生        | ");
		System.out.println("|     3. 修改学生        | ");
		System.out.println("|     4. 删除学生        | ");
		System.out.println("|     5. 查找学生        | ");
		System.out.println("|     6. 退出程序            | ");
		System.out.println("|    请输入选择（1-6）：     |");
	}
 
 
 
 
	// 执行菜单中的功能
	public void executeTask() {
		show();
		// 提示
		System.out.println("请输入1-6中的数字");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
		
			int number = scanner.nextInt();
			if (number < 1 || number > 6) {
				System.out.println("数字非法，必须在1-6之间");
			} else {
				switch (number) {
				case 1:
					System.out.println("请输入学生姓名和年龄");
					// 增加学生
					String name = scanner.next();
					int age = scanner.nextInt();
					Student student = new Student(name, age);
					list.add(student);
					System.out.println(list.size());
					break;
				case 2:
					System.out.println("显示所有的学生信息");
					for (Student s : list) {
						System.out.println(s);
					}
					break;
				case 3:
				
					boolean flag = false;
					System.out.println("修改学生,请输入您的姓名和修改后的年龄");
					System.out.println("输入姓名");
					String name3 = scanner.next();
					for (int i = 0; i < list.size(); i++) {
						Student student3 = list.get(i);
						if (student3.getName().equals(name3)) {
							flag = true;
							System.out.println("原来信息：" + student3);
				
							System.out.println("输入年龄");
							int age3 = scanner.nextInt();
							student3.setAge(age3);
							System.out.println("修改后信息：" + student3);
						} 
						
					}
					if (!flag) {
						System.out.println("不存在此学生姓名，请重新输入");
					}
					
					break;
				case 4:
					
					boolean flag4 = false;
					System.out.println("删除学生,请输入您的姓名");
					System.out.println("输入姓名");
					String name4 = scanner.next();
					System.out.println("原来集合数量：" + list.size());
					for (int i = 0; i < list.size(); i++) {
						Student student3 = list.get(i);		
						if (student3.getName().equals(name4)) {
							flag4 = true;
							list.remove(i);
							System.out.println("现在集合数量：" + list.size());
						} 
						
					}
					if (!flag4) {
						System.out.println("不存在此学生姓名，请重新输入");
					}
					break;
				case 5:
					//添加标志位，用来标志是否存在此学生姓名，默认不存在
					boolean flag5 = false;
					System.out.println("查找学生,请输入您的姓名");
					System.out.println("输入姓名");
					String name5 = scanner.next();
					for (int i = 0; i < list.size(); i++) {
						Student student3 = list.get(i);		
						if (student3.getName().equals(name5)) {
							flag5 = true;
							System.out.println("学生已找到，信息为：" + student3);
							break; 
						} 
						
					}
					if (!flag5) {
						System.out.println("不存在此学生姓名，请重新输入");
					}
					break;
				case 6:
					System.exit(0);
					break;
 
 
				default:
					break;
				}
			}
		}
		scanner.close();
	}
 
 
}


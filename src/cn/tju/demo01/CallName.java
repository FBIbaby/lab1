package cn.tju.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * 随机点名器
 * 1.创建集合，将Student对象存储到集合中
 * 2.遍历集合
 * 3.随机点名一个学生
 * 		生成一个随机数作为索引
 */
public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		printStudent(array);
		callName(array);
	}
	
	
	public static void addStudent(ArrayList<Student> array){
		Student s1 = new Student();
		s1.setName("小明");
		s1.setAge(16);
		
		Student s2 = new Student();
		s2.setName("小红");
		s2.setAge(15);
		
		Student s3 = new Student();
		s3.setName("小王");
		s3.setAge(17);
		
		Student s4 = new Student();
		s4.setName("小李");
		s4.setAge(16);
		
		Student s5 = new Student();
		s5.setName("大明");
		s5.setAge(17);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
	}
	
	public static void printStudent(ArrayList<Student> array){
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+" "+s.getAge());
		}
	}
	
	public static void callName(ArrayList<Student> array){
		Random ran = new Random();
		int index = ran.nextInt(array.size());
		Student st = array.get(index);
		System.out.println("点个名");
		System.out.println(st.getName()+" "+st.getAge());
		
	}
}


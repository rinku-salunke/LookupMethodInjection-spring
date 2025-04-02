package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {

	
ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

Student student1=(Student) ac.getBean("s");
System.out.println(student1);
System.out.println(student1.getAdr());	


Student student2=(Student) ac.getBean("s");
System.out.println(student2);
System.out.println(student2.getAdr());	


}
}

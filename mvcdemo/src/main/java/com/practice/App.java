package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ApplicationContext contex=new ClassPathXmlApplicationContext("New.xml");
             Applica app=(Applica)contex.getBean("applica");
             app.add();
	}

}

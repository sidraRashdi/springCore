package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
          conctructInject con= (conctructInject)context.getBean("construct");
          System.out.println( con );
	}

}

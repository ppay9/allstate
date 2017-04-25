package com.demo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Mail mail = (Mail) ctx.getBean("mail");
		System.out.println(mail.getMessage().getBody());
		
		mail.getMessage().setBody("Tea break at 3:30pm");
		
		Mail mail1 = (Mail) ctx.getBean("mail");
		
		System.out.println(mail1.getMessage().getBody());
		
		System.out.println(mail.getMessage().getBody());
		
		
		
	}
}

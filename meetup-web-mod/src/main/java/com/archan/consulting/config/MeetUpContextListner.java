package com.archan.consulting.config;

import javax.servlet.ServletContextEvent;

public class MeetUpContextListner  extends org.springframework.web.context.ContextLoaderListener{
	
	@Override
	public void contextInitialized(ServletContextEvent event){
		System.out.println("*************satart contextInitialized");
		super.contextInitialized(event);
		
		System.out.println("*************end contextInitialized");
	}
	
}

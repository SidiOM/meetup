package com.archan.consulting.service;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.archan.consulting.beans.remote.TestBeanRemote;


public class ServiceManager {
    
	private static final String CONTEXT_FILE = "beans.xml"; //"C:\\workspacRcp\\meetup-services-mod\\src\\main\\resources\\beans.xml";
	
	private static ApplicationContext context;
	
	private static ServiceManager serviceManager = null;
		
	public static ServiceManager getServiceManager(){
		if(serviceManager==null){
			serviceManager = new ServiceManager();
		}
		return serviceManager;
	}
	
	private ServiceManager() {
		context = new ClassPathXmlApplicationContext(CONTEXT_FILE);
	}

	public Object getBean(String name){
		return context.getBean(name);
	}
	
	public TestBeanRemote getEjbService(){
		return (TestBeanRemote) context.getBean("ejbClient");
	}
	
	public static void main(String[] args) {
		String str = getServiceManager().getEjbService().sayHello();
		System.out.println(str);
	}
}

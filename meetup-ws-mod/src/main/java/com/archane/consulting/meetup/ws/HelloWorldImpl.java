package com.archane.consulting.meetup.ws;
 
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.jws.WebService;



import com.archan.consulting.beans.TestBean;
import com.archan.consulting.beans.remote.TestBeanLocal;
 
//Service Implementation
@WebService(
		serviceName = "HelloWorldService", 
		portName = "HelloWorld", 
		name = "HelloWorld", 
		endpointInterface = "com.archane.consulting.meetup.ws.HelloWorld", 
		targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld"
)
public class HelloWorldImpl implements HelloWorld{
 
	@EJB(beanName="ejbTest")
	TestBeanLocal service;
	
	public String getHelloWorldAsString(String name) {
		//return "Hello World JAX-WS " + name;
		return service.sayHello();
	}
 
}
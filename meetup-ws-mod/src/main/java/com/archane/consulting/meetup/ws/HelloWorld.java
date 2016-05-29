package com.archane.consulting.meetup.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@SOAPBinding(style = Style.RPC)
@WebService(targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld")
public interface HelloWorld{
 
	@WebMethod String getHelloWorldAsString(String name);
 
}
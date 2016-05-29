package com.archan.consulting.beans.remote;

import javax.ejb.Remote;
//import org.jboss.annotation.ejb.RemoteBinding;

@Remote
public interface TestBeanRemote {
	String sayHello();
}

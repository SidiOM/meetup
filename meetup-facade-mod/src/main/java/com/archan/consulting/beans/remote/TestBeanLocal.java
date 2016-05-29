package com.archan.consulting.beans.remote;

import javax.ejb.Local;

@Local
public interface TestBeanLocal {
	String sayHello();
}

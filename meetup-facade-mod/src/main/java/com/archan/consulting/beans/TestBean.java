package com.archan.consulting.beans;

import javax.ejb.Stateless;

import com.archan.consulting.beans.remote.TestBeanLocal;
import com.archan.consulting.beans.remote.TestBeanRemote;

@Stateless(name="ejbTest")
public class TestBean implements TestBeanRemote, TestBeanLocal {
	public String sayHello(){
		return "Hello ejb ***";
	}
}

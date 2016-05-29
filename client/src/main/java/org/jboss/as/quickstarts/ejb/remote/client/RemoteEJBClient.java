/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.ejb.remote.client;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.archan.consulting.beans.remote.TestBeanRemote;

import java.util.Hashtable;

/**
 * A sample program which acts a remote client for a EJB deployed on AS7 server. This program shows how to lookup stateful and
 * stateless beans via JNDI and then invoke on them
 * 
 * @author Jaikiran Pai
 */
public class RemoteEJBClient {

    public static void main(String[] args) throws Exception {
    	final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        jndiProperties.put("jboss.naming.client.ejb.context",true);
        final Context context = new InitialContext(jndiProperties);
    	
    	TestBeanRemote bean =(TestBeanRemote) context.lookup("ejb:master/meetup-facade-mod/ejbTest!com.archan.consulting.beans.remote.TestBeanRemote");
    	System.out.println(bean.sayHello());
    	
    	context.close();
    }

}

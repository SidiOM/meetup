package com.archan.consulting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.archan.consulting.dao.PatientDAO;
import com.archan.consulting.model.Patient;


@Test
@ContextConfiguration(locations = { "classpath:applicationContext.xml" ,"classpath:spring-test-config.xml"})
public class TestSpring extends AbstractTestNGSpringContextTests {

	@Autowired
	PatientDAO dao;

	@Test()
	void testDAO() {

		Patient patient = new Patient();
		patient.setFirstName("test");
		patient.setLastName("last");
		patient.setEmail("feedback@yoursite.com");
		
		dao.create(patient);

		Assert.assertNotNull(patient);
		Assert.assertEquals(patient, "feedback@yoursite.com");
		

	}

}


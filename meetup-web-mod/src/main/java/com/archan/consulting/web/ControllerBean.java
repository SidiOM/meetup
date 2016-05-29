package com.archan.consulting.web;

import java.io.Serializable;


//import javax.inject.Named;
//import javax.faces.bean.RequestScoped;
import org.jboss.logging.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.archan.consulting.model.Patient;
import com.archan.consulting.service.PatientService;

import org.springframework.context.annotation.Scope;

//@Named("controllerBean")
//@RequestScoped
//@Component
@Component("controllerBean")
//@Scope("session")
public class ControllerBean implements Serializable{

	
	public static Logger logger = Logger.getLogger(ControllerBean.class);
	
	private static final long serialVersionUID = 1L;

	private Patient patient;
	
	@Autowired
	private PatientService patientService;
	

	public ControllerBean() {
		patient= new Patient();
		logger.info("*************************************ControllerBean is initialized: ");
		System.out.println("******ControllerBean loader: "+getClass().getClassLoader());
		System.out.println("******ControllerBean loader parent: " + getClass().getClassLoader().getParent());
	}

	public String addPatient(){
		
		patientService.create(patient);
		System.out.println("*******addPatient******");
		return "home";
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		System.out.println("******ControllerBean"+patientService);
		this.patientService = patientService;
	}
    	
}

package com.archan.consulting.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.archan.consulting.dao.PatientDAO;
import com.archan.consulting.model.Patient;
import com.archan.consulting.service.PatientService;


@Service("patientService")
public class PatientServiceImpl implements PatientService{

	//@Autowired
	//@Qualifier("patientDAO")
	@Resource(name="patientDAO")
    private PatientDAO patientDAO;

    
	public PatientServiceImpl(PatientDAO patientDAO) {
		
		this.patientDAO = patientDAO;
	}
    
	public PatientServiceImpl() {
		if(patientDAO==null){
			System.out.println("***************patientDAO null*********** ");
		}
		System.out.println("***************PatientServiceImpl constructor*********** ");
	}
    
	@Transactional
	public Patient create(Patient patient){
		if(patientDAO==null){
			throw new RuntimeException("patientDAO is null");
		}
		return patientDAO.create(patient);
	}

	public PatientDAO getPatientDAO() {
		return patientDAO;
	}
	@Required
	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}
}

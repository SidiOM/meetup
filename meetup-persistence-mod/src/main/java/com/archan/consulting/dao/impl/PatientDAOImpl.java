package com.archan.consulting.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archan.consulting.dao.PatientDAO;
//import com.archan.consulting.dao.PatientDAO;
import com.archan.consulting.model.Patient;

@Repository("patientDAO")
//@Component("patientDAO")

public class PatientDAOImpl extends CommonDAO implements PatientDAO {

	public Class<Patient> getEntityClass() {
		return Patient.class;
	}

	public PatientDAOImpl() {
		System.out.println("************PatientDaoImpl :");
		System.out.println("******PatientDaoImpl loader: "
				+ getClass().getClassLoader());
		System.out.println("******PatientDaoImpl loader parent: "
				+ getClass().getClassLoader().getParent());
	}

	public Patient find(Long id) {
		if (id == null)
			throw new RuntimeException("Invalid " + getEntityClass().getName()
					+ " id");

		return entityManager.find(getEntityClass(), id);
	}

	public Patient create(Patient entity) {
		if (entity == null)
			throw new RuntimeException("object is null");
		try {
			System.out.println("*create patient**************************");
			entityManager.persist(entity);
			entityManager.flush();
		} catch (Exception e) {
			System.out.println("Exception in create");
			e.printStackTrace();
			System.out.println("***************************");
		}
		System.out.println("*create patient**************************");
		return entity;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager em) {
		System.out.println("*******************em" + em);
		this.entityManager = em;
	}
}

package com.archan.consulting.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.archan.consulting.dao.PatientDAO;
import com.archan.consulting.model.Patient;


public  class CommonDAO {

	@PersistenceContext
    protected EntityManager entityManager;
	
	public CommonDAO() {
		super();
		System.out.println("*****************AbstractDAO******************");
	} 


//	public T find(Long id) {
//	        if (id == null)
//	            throw new RuntimeException("Invalid "+getEntityClass().getName()+" id");
//
//	        return entityManager.find(getEntityClass(), id);
//	}

//	public T findByName(String name) {
//	        if (name == null)
//	            throw new RuntimeException("Invalid "+getEntityClass().getName()+" name");
//
//	        TypedQuery<T> typedQuery = em.createNamedQuery(Category.FIND_BY_NAME, getEntityClass());
//	        typedQuery.setParameter("name", name);
//	        return typedQuery.getSingleResult();
//	    }

//	    public List<T> findAllCategories() {
//	        TypedQuery<Category> typedQuery = em.createNamedQuery(Category.FIND_ALL, Category.class);
//	        return typedQuery.getResultList();
//	    }

	  
}

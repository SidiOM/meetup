package com.archan.consulting.dao;



import com.archan.consulting.model.Patient;

public interface  PatientDAO  {


	public Patient find(Long id) ;

    //public T findByName(String name);

    //public List<T> findAllCategories();

	public Patient create(Patient entity);
	   
}

package com.oneday.services;

import java.util.List;

import com.oneday.models.Person;

public interface IPersonService {

	    /**
	     * get all category
	     * 
	     * @return
	     */
	    public Person createPerson( Person persobn);

		public List<Person> findAllPerson();



	}

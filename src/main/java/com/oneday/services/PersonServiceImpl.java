package com.oneday.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneday.models.Person;
import com.oneday.repository.PersonRepository;

@Service
public class PersonServiceImpl implements IPersonService {
	
	private PersonRepository personRepository;

	
    @Autowired
    public PersonServiceImpl( PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public List<Person> findAllPerson() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}


}

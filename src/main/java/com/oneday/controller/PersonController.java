package com.oneday.controller;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneday.models.Person;
import com.oneday.services.IPersonService;

@RestController
@RequestMapping(path = PersonController.PATH)
public class PersonController {
	public static final String PATH = "/api/v1.0/person";
    private IPersonService personService;
    private  MongoTemplate mongoTeamplate;

	@Autowired
	HttpServletRequest request;

	@Inject
	public PersonController(IPersonService personServicey) {
		this.personService = personServicey;
	}

	@GetMapping
	public Iterable<Person> persons() {
		return personService.findAllPerson();
	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Person personById(@PathVariable("id") String id) {
//		return personService.findOne(id);
//	}
//
//	@RequestMapping(value = "/lastname/{name}", method = RequestMethod.GET)
//	public Iterable<Person> PersonByName(@PathVariable("name") String name) {
//		return personService.findByLastName(name);
//	}
//
	
//    @PostMapping
//    public PolicyGenInfoDTO createNewPolicy( @RequestBody @Validated PolicyGenInfoDTO genInfo )
//    {
//        UserBean currentUser = authEngine.getCurrentUserBean();
//        return policyService.createNewPolicy(genInfo, currentUser);
//    }

	@PostMapping
	public Person createPerson(@RequestBody @Validated Person Person) {
		Person savedPerson = personService.createPerson(Person);
		return savedPerson;
	}
//
//	@DeleteMapping
//	@ResponseStatus(NO_CONTENT)
//	public void deteAll() {
//		personService.deleteAll();
//	}
//
//	@DeleteMapping("{id}")
//	@ResponseStatus(NO_CONTENT)
//	public void deleteById(@PathVariable("id") String id) {
//		personService.delete(id);
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Person update(@PathVariable("id") String id, @RequestBody Person updatePerson) {
//		return personService.save(updatePerson);
//	}
}

package com.example.FCCApp1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FCCApp1.model.Person;
import com.example.FCCApp1.service.PersonService;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	public PersonController (PersonService personService) {
				this.personService=personService;
	}
	
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	@GetMapping
	public List<Person> getAllPeople(){
		return personService.getAllPeople();
	}
}
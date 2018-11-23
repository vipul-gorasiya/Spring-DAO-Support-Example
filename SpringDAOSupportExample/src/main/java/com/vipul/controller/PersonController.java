package com.vipul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vipul.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping("/")
	public String welcome() {
		personService.callMethods();
		return "Please observe logs/console to see the calls.";
	}

}

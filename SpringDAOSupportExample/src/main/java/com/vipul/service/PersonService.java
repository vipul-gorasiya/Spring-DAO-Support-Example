package com.vipul.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vipul.dao.HibernatePersonDAO;
import com.vipul.dao.JdbcPersonDAO;
import com.vipul.entity.Person;
import com.vipul.repository.IPersonJPARepository;
import com.vipul.repository.PersonJPARepository;

@Transactional
@Service
public class PersonService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private IPersonJPARepository iPersonJPARepository;
	@Autowired
	private PersonJPARepository personJPARepository;
	@Autowired
	private HibernatePersonDAO hibernatePersonDAO;
	@Autowired
	private JdbcPersonDAO jdbcPersonDAO;

	public void callMethods() {
		Person person = new Person();
		person.setFirstName("First Name1");
		person.setLastName("Last Name1");
		person.setEmail("email1");
		addPerson(person);
		Person person2 = new Person();
		person2.setFirstName("First Name2");
		person2.setLastName("Last Name2");
		person2.setEmail("email2");
		addPerson(person2);
		List<Person> persons = getAllPersons();
		LOGGER.info("No of Persons in dabase" + persons.size());

		Person person3 = getPerson(persons.get(1).getId());
		LOGGER.info("Retrieved Person's First Name is:{}. We will delete this Record from database.",
				person3.getFirstName());
		deletePerson(person3.getId());
		persons = getAllPersons();
		LOGGER.info("No of Persons in dabase" + persons.size());
	}

	public Person addPerson(Person person) {
		LOGGER.info("Person saved to database using JPA Repository");
		return iPersonJPARepository.save(person);
	}

	public Person getPerson(long personId) {
		LOGGER.info("Person retrieved from database using JPA Repository using Entity Manager");
		return personJPARepository.getById(personId);
	}

	public List<Person> getAllPersons() {
		LOGGER.info("Persons retrieved from database using DAO using Hibernate Session");
		return hibernatePersonDAO.getAllPersons();
	}

	public void deletePerson(long personId) {
		LOGGER.info("Person deleted from database using Jdbc dao");
		jdbcPersonDAO.delete(personId);
	}

}

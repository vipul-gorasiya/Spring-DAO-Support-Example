package com.vipul.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.vipul.entity.Person;

@Repository
public class PersonJPARepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Person getById(long personId) {
		return entityManager.find(Person.class, personId);
	}
}

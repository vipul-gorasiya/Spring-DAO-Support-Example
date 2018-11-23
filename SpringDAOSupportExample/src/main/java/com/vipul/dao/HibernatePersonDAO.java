package com.vipul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vipul.entity.Person;

@Repository
public class HibernatePersonDAO {

	@Autowired
	private EntityManager entityManager;

	public List<Person> getAllPersons() {
		Session session = getSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		query.from(Person.class);
		return session.createQuery(query).list();
	}

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}
}

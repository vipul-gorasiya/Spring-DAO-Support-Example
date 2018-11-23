package com.vipul.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPersonDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void delete(long personId) {
		jdbcTemplate.execute("delete from Person where id=" + personId);
	}
}

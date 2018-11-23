package com.vipul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vipul.entity.Person;

@Repository
public interface IPersonJPARepository extends JpaRepository<Person, Long> {

}

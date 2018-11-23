package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vipul.service.PersonService;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDaoSupportExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDaoSupportExampleApplication.class, args);
		PersonService personService = context.getBean(PersonService.class);
		personService.callMethods();
	}

}

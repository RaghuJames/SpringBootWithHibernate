package com.Hibernate.configuratuon;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages= {"com.Hibernate.Controllers","com.Hibernate.service","com.Hibernate.DAO"})
@EntityScan(basePackages= {"com.Hibernate.model"})
@EnableTransactionManagement
public class SpringBootController {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootController.class, args);

	}
	
	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}

}

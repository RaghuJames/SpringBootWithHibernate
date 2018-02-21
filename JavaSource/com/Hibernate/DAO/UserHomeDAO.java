package com.Hibernate.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Hibernate.model.User;

@Repository
public class UserHomeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void getUser(User u) {
		try {
			System.out.println("========="+u.getUserId()+"========="+u.getUserName());
		sessionFactory.getCurrentSession().save(u);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

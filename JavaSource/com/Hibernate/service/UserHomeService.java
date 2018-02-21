package com.Hibernate.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hibernate.DAO.UserHomeDAO;
import com.Hibernate.model.User;

@Service
public class UserHomeService {
	
	@Autowired
	private UserHomeDAO userHomeDAO;
	@Transactional
	public void getUser(User u) {
		this.userHomeDAO.getUser(u);
		
	}

}

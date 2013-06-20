package com.minco.jpa.persistence.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.persistence.IUserDAO;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void saveUser(UserInfo userInfo) {
		em.persist(userInfo);
	}

	public UserInfo getUser(String id) {
		return em.find(UserInfo.class, id);
	}

}

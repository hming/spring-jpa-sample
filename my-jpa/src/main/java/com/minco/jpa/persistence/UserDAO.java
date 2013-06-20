package com.minco.jpa.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.minco.jpa.domain.UserInfo;

public class UserDAO implements IUserDAO {
	
	public void saveUser(UserInfo userInfo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SimplePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(userInfo);
		em.getTransaction().commit();
		emf.close();
	}

	public UserInfo getUser(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SimplePU");
		EntityManager em = emf.createEntityManager();
		return em.find(UserInfo.class, id);
	}

}

package com.minco.jpa.persistence;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

public class UserDaottt implements UserDaoCustomer{
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public int getUserCount() {
		Query q = em.createNativeQuery("select count(1) from t_userinfo");
		return ((BigInteger) q.getSingleResult()).intValue();
	}

}

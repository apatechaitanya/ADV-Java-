package com.usercart.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class GenericDao {
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("usercart");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			// 2 in 1 method insert and update
			em.merge(obj); // it will generate query
			tx.commit();
		}finally {
			emf.close();
		}
	}

	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("usercart");
		try {
			EntityManager em = emf.createEntityManager();
			Object obj = em.find(clazz, pk);
			return obj;
		}finally {
			emf.close();
		}
	}
}

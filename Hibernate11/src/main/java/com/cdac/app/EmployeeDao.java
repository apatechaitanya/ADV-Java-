package com.cdac.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

public class EmployeeDao {
	public void add(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(emp);  //it will generate query
		tx.commit();
		emf.close();
	}
	public Employee check(String username,String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e from Employee e where e.name =:em and e.password=:me");
		q.setParameter("em",username);
		q.setParameter("me",password);
		Employee list = (Employee) q.getSingleResult();
		return list;
	}
	
}

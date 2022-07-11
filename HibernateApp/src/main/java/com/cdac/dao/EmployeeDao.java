package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

public class EmployeeDao {
//	public static EntityManagerFactory emf=null;
//	static {
//	}
	public void add(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");		

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(emp);  //it will generate query
		tx.commit();
		emf.close();
	}
	
	public Employee fetch(int empno) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");		
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class,empno);
		
		emf.close();
		
		return emp;
	}
	
	public List<Employee> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e from Employee e");
		List<Employee> list = q.getResultList();
		emf.close();
		return list;
	}
	
	public List<String> fetchAllName(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e.name from Employee e");
		List<String> list = q.getResultList();
		emf.close();
		return list;
	}
	public List<Object[]> fetchAllNameAndSalaries(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e.name,e.salary from Employee e");
		List<Object[]> list = q.getResultList();
		emf.close();
		return list;
	}
}

package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;
import com.cdac.entity.Employee;

public class CustomerAddressDao {
//	public static EntityManagerFactory emf=null;
//	static {
//	}
	public void add(Customer cmt) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(cmt); // it will generate query
		tx.commit();
		emf.close();
	}
	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(cust); //merge method will generate update query
		tx.commit();
		emf.close();
	}

	public void add(Address addrs) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(addrs); // it will generate query
		tx.commit();
		emf.close();
	}
	public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Customer addr = em.find(Customer.class, id);
		emf.close();
		return addr;
	}
	
	public Address fetchAddress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Address addr = em.find(Address.class, id);
		emf.close();
		return addr;
	}
	public List<Customer> fetchCustomerByEmail(String domain){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em","%"+domain+"%");
		List<Customer> list = q.getResultList();
		return list;
	}
	public List<Customer> fetchCustomerByCity(String city){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select c from Customer c join c.address a where a.city =:ct");
		q.setParameter("ct",city);
		List<Customer> list = q.getResultList();
		return list;
	}
	public Address fetchCustomerAddressByName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Customer c join c.address a where c.name=:nm");
		q.setParameter("nm",name);
		Address addr= (Address)q.getSingleResult();
		return addr;
	}
}

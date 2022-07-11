package com.cdac.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Address;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

import antlr.collections.List;

public class PersonPassportDao {
	public void add(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(person); // it will generate query
		tx.commit();
		emf.close();
	}
	public Person fetchPersonByPassID(int passportNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Person p join  p.passport ps where ps.passportNo = :em ");
		q.setParameter("em",passportNo);
		Person person = (Person) q.getSingleResult();
		return  person;
	}
	public ArrayList<Person> fetchPersonByExpiryYear(int year){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Person p join  p.passport ps where year(ps.expiryDate) = :em ");
		q.setParameter("em",year);
		ArrayList<Person> person = (ArrayList<Person>) q.getResultList();
		return  person;
	}
}

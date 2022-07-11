package com.cdac.app;

import java.time.LocalDate;
import java.util.ArrayList;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportMain {

	public static void main(String[] args) {
		PersonPassportDao personPassportDao = new PersonPassportDao();
//		Data add code
		
//		Person person = new Person();
//		person.setName("Aniket Patil");
//		person.setEmail("aniket@gmail.com");
//		person.setDateOfBirth(LocalDate.of(2000,11,12));
//		
//		Passport passport = new Passport();
//		passport.setIssueDate(LocalDate.of(2010,11,03));
//		passport.setExpiryDate(LocalDate.of(2023,06, 12));
//		passport.setIssuedBy("Gov. Of India");
//		
//		person.setPassport(passport);
//		passport.setPerson(person);
//		
//		personPassportDao.add(person);
		
		//Fetch Person by PassNO
//		Person person = personPassportDao.fetchPersonByPassID(1);
//		System.out.println(person.getName()+" "+person.getEmail()+" "+person.getDateOfBirth());
		
		//Fetch Person By Expiary data
		ArrayList<Person> person = personPassportDao.fetchPersonByExpiryYear(2022);
		for(Person p :person) {
			System.out.println(p.getName()+" "+p.getEmail()+" "+p.getDateOfBirth());
		}
		
	}

}

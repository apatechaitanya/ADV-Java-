package com.cdac.app;

import java.util.List;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class AddCustomerAndAddrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAddressDao dao = new CustomerAddressDao();
		/*	Customer c = new Customer();
		c.setName("Chaitanya");
		c.setEmail("apatechaitanya@gmail.com");
		dao.add(c);
		
		Address a = new Address();
		a.setPincode(416002);
		a.setState("Maharashtra");
		a.setCity("KOP");
		dao.add(a);   */
		
		/* Customer c= dao.fetchCustomer(1);
		Address a = dao.fetchAddress(1);
		c.setAddress(a);
		dao.update(c);  */
		
		/*
		Customer c = new Customer();
		c.setName("Ankita");
		c.setEmail("Ankita@yahoo.com");
		
		Address a = new Address();
		a.setState("Maharashtra");
		a.setState("Warud");
		a.setPincode(416018);
		
		c.setAddress(a);
		dao.add(c);
		
		
		/*
		List<Customer> list = dao.fetchCustomerByEmail("yahoo");
		for(Customer c:list) {
			System.out.println(c.getEmail()+" "+c.getName());
		}
		*/
		
		/*
		List<Customer> list = dao.fetchCustomerByCity("kop");
		for(Customer c:list) {
			System.out.println(c.getEmail()+" "+c.getName());
		}
		*/
		/*
		Address a = dao.fetchCustomerAddressByName("Chaitanya");
		System.out.println(a.getCity()+" "+a.getPincode()+" "+a.getState());
		*/ //we can use it for login
	}

}

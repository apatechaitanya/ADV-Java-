package com.usercart.app;

import com.usercart.dao.GenericDao;
import com.usercart.entity.User;

public class UserCartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDao genericDao = new GenericDao();
		
			User user = new User();
			user.setName("Chaitanya Apate");

			genericDao.save(user);
			
			
		
			
	}

}

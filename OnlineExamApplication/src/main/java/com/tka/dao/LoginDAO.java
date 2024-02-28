package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.User;



@Repository
public class LoginDAO 
{
	@Autowired
	SessionFactory factory;

	public String getPasswordFromDabase(String username)
	{
		Session session=factory.openSession();
		
		
		
		User userFromDB=session.get(User.class,username);
		
		
		
		return userFromDB.getPassword();
		
	}
	
}

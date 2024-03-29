package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.UserDAO;
import com.tka.entity.User;

@Service
public class UserService 
{
	@Autowired
	UserDAO dao;
	
	public List<User> getAllUsers()
	{
		return dao.getAllUsers();
	}
	
	
	public User getUser(String username)
	{
		return dao.getUser(username);
	}
	
	public void deleteUser(String username)
	{
		dao.deleteUser(username);
	}
	
	
	public void saveUser(User user)
	{
		dao.saveUser(user);
	}
	
}
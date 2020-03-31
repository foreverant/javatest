package com.zjs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjs.dao.UserDao;
import com.zjs.model.User;
import com.zjs.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
	@Override
	public User loginUser(User user) {
		return userDao.loginUser(user);
	}
}

package com.zjs.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zjs.dao.UserDao;
import com.zjs.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addUser(User user) {
		hibernateTemplate.save(user);
	}
	
	@Override
	public User loginUser(User user) {
		return hibernateTemplate.get(User.class,1);
	}
}

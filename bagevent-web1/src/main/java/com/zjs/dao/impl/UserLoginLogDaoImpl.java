package com.zjs.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zjs.dao.UserLoginLogDao;
import com.zjs.model.User;
import com.zjs.model.UserLoginLog;
import com.zjs.service.UserLoginService;

@Transactional
@Repository
public class UserLoginLogDaoImpl implements UserLoginLogDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public void addUserLoginLog(UserLoginLog userloginlog) {
		hibernateTemplate.save(userloginlog);
		
	}


	@Override
	public List<UserLoginLog> getUserList(UserLoginLog userloginlog) {
		return (List<UserLoginLog>) hibernateTemplate.get(UserLoginLog.class,1);
	}

}

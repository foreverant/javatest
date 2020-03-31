package com.zjs.dao;

import java.util.List;

import com.zjs.model.UserLoginLog;

public interface UserLoginLogDao {
	void addUserLoginLog(UserLoginLog userloginlog);
	
	public List<UserLoginLog> getUserList(UserLoginLog userloginlog);
}

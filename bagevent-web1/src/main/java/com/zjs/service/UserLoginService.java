package com.zjs.service;

import java.util.List;

import com.zjs.model.UserLoginLog;;

public interface UserLoginService {
	void addUserLoginLog(UserLoginLog userloginlog);
	
	public List<UserLoginLog> getUserList(UserLoginLog userloginlog);
}

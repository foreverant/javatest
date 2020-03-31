package com.zjs.dao;

import com.zjs.model.User;

public interface UserDao {
	void addUser(User user);
	User loginUser(User user);
}

package com.zjs.service;

import com.zjs.model.User;

public interface UserService {
	void addUser(User user);
	User loginUser(User user);
}

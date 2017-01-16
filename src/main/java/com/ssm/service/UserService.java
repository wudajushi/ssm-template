package com.ssm.service;

import java.util.List;

import com.ssm.entity.User;

public interface UserService {

	void delete(User user);

	void update(User user);

	int insert(User user);

	List<User> select(int begin, int end);
}

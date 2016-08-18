package com.ssm.dao;

import java.util.List;

import com.ssm.entity.User;

public interface IUserDao {

	public void delete(User user);
	public void update(User user);
	public int insert(User user);
	public List<User> select(int begin,int end);
}

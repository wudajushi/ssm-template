package com.ssm.dao;

import java.util.List;
import java.util.Map;

import com.ssm.entity.User;

public interface UserDao {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> selectAll(Map<String, Object> map);
}
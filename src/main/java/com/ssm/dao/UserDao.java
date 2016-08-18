package com.ssm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssm.entity.User;
import com.ssm.mapper.UserMapper;

public class UserDao implements IUserDao {

	private UserMapper userMapper;
	
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public void delete(User user) {
		userMapper.deleteByPrimaryKey(user.getId());

	}

	public void update(User user) {
		userMapper.updateByPrimaryKeySelective(user);

	}

	public int insert(User user) {
		
		return userMapper.insertSelective(user);
	}

	public List<User> select(int begin, int end) {
	    Map<String,Object> map=new HashMap<String,Object>();
	    map.put("begin", begin);
	    map.put("end", end);
		return userMapper.selectAll(map);
	}

}

package com.ssm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void delete(User user) {
		userDao.deleteByPrimaryKey(user.getId());
	}

	public void update(User user) {
		userDao.updateByPrimaryKeySelective(user);
	}

	public int insert(User user) {
		return userDao.insertSelective(user);
	}

	public List<User> select(int begin, int end) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("begin", begin);
		map.put("end", end);
		return userDao.selectAll(map);
	}

}

package com.ssm.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssm.dao.UserDao;
import com.ssm.entity.User;

@Controller
public class tablesControl {

	@Autowired
    private	UserDao userDao;
	
	@RequestMapping(value="test")
	public String test(){
		List<User> list=userDao.select(0, 10);
		System.out.println(list);
		return "index";
	}
}

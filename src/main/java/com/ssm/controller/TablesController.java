package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@Controller
public class TablesController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		List<User> list = userService.select(0, 10);
		System.out.println(list);
		return "index";
	}
}

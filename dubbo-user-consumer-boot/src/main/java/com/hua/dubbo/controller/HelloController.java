package com.hua.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hua.dubbo.bean.Order;
import com.hua.dubbo.bean.User;
import com.hua.dubbo.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@GetMapping("/hello")
	public Object hello() {
		User user = new User();
		user.setId(1);
		user.setUsername("hua");
		Order order = userService.buyNewMovie(user);
		return order;
	}
}

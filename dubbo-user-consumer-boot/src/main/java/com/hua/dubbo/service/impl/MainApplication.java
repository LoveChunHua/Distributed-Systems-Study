package com.hua.dubbo.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hua.dubbo.bean.Order;
import com.hua.dubbo.bean.User;
import com.hua.dubbo.service.UserService;

public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("测试远程调用。。。。");
		UserService userService =context.getBean(UserService.class);
		User user =new User();
		user.setId(1);
		user.setUsername("hua");
		Order buyNewMovie = userService.buyNewMovie(user);
		System.in.read();
	}
}

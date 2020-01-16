package com.hua.dubbo.service;

import com.hua.dubbo.bean.Order;
import com.hua.dubbo.bean.User;

public interface UserService {
	public Order buyNewMovie(User user);//通过用户信息查询新电影的订单信息
}

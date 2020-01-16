package com.hua.dubbo.service.impl;

import com.hua.dubbo.bean.Movie;
import com.hua.dubbo.service.MovieService;

/*
	用dubbo的步骤
	1）、引入dubbo的依赖和操作zk的客户端
	2）、配置服务提供者将服务暴露出来（注册到注册中心，让别人感知到）；

*/public class MovieServiceImpl implements MovieService {

	@Override
	public Movie getNewMovie() {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.setId(1);
		movie.setMovieName("妇联4");
		movie.setPrice(96.99);
		System.out.println("电影服务查询到的最新的电影："+movie.getMovieName());
		return movie;
	}

}

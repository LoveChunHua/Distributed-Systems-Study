package com.hua.dubbo.service.impl;

import com.hua.dubbo.bean.Movie;
import com.hua.dubbo.bean.Order;
import com.hua.dubbo.bean.User;
import com.hua.dubbo.service.MovieService;
import com.hua.dubbo.service.UserService;

public class UserServiceImpl implements UserService{

	MovieService movieService;
	public MovieService getMovieService() {
		return movieService;
	}
	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}
	@Override
	public Order buyNewMovie(User user) {
		Order order = new Order();
		//1、远程查询最新电影并返回
		Movie movie = movieService.getNewMovie();
		
		System.out.println("远程调用movie服务获取到结果：" +movie);
		//2、封装order对象返回
		order.setMovieId(movie.getId());
		order.setMovieName(movie.getMovieName());
		order.setUserName(user.getUsername());
		return order;
	}
}

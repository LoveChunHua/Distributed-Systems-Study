package com.hua.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/*
	Spring Boot引入dubbo的方法
	1、引入dubbo的starter
	2、dubbo相关的场景自动配好了?
		1)、以前配置的再配置一下
		2)、服务提供者，使用@Service暴露服务
		3)、服务消费者，使用@Reference引用服务
	3、开启dubbo基于注解的功能
	
	dubbo配置优先原则：
	方法级优先，接口级次之，全局配置再次之。
	如果级别一样，则消费方优先，提供方次之。
	总结：越精确越优先
*/
@EnableDubbo
@SpringBootApplication
public class DubboMovieProviderBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboMovieProviderBootApplication.class, args);
	}

}

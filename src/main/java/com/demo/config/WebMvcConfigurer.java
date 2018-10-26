package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.demo.interceptor.DemoInterceptor;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//众多的拦截器组成了一个拦截器链
		/**
		 * 主要方法说明：
		 * addPathPatterns 用于添加拦截规则
		 * excludePathPatterns 用户排除拦截
		 */
		registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/*");
		super.addInterceptors(registry);
	}

}

package com.myworld.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.myworld.aopdemodao.AccountDAO;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.myworld")
public class DemoConfig {

	@Bean
	public AccountDAO accountDAO() {
		return new AccountDAO();
	}
}

package com.myworld.aopdemoaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our related advices logging
	
	//lets start with an @Before advice
	
	@Before("execution(* com.myworld.aopdemodao.*.*(..))")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n====>> Executing @Before advice on addAccount()");
	}
}

package com.simple.StudentAPI.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AspectConfig {

	/**
	 *	Logging
	 *	Exception Handling
	 *	Time Taken
	 */
	
	private Logger log = LoggerFactory.getLogger(AspectConfig.class);
	
	@Before(value = "execution(* com.simple.StudentAPI.controller.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		//joinPoint.getSignature().
		log.info("Executing : {}", joinPoint);
	}
	
	@After(value = "execution(* com.simple.StudentAPI.controller.*.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.info("Complete Execution : {}", joinPoint);
	}
	
}

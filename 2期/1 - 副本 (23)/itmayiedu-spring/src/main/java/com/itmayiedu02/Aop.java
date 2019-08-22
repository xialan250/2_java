
package com.itmayiedu02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {

	@Before("execution(* com.itmayiedu02.service.*.*(..))")
	public void begin() {
		System.out.println("前置通知....");
	}

	@After("execution(* com.itmayiedu02.service.*.*(..))")
	public void commit() {
		System.out.println("后置通知....");
	}

	@AfterReturning("execution(* com.itmayiedu02.service.*.*(..))")
	public void afterRun() {
		System.out.println("运行通知....");
	}

	@AfterThrowing("execution(* com.itmayiedu02.service.*.*(..))")
	public void afterThrowing() {
		System.out.println("异常通知");
	}

	@Around("execution(* com.itmayiedu02.service.*.*(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("我是环绕通知-前");
		proceedingJoinPoint.proceed();
		System.out.println("我是环绕通知-后");
	}

}

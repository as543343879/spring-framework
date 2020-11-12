package com.mg.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Aspect class
 *
 * @author 谢小平
 * @date 2020-09-21
 */

@Aspect
@Component("ibeanAspect")
public class BeanAspect {
	@Pointcut("execution(* com.mg.bean.*.*(..))")
	public void point(){}

	@Before("point()")
	public void before(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + "    执行 ");
	}


}

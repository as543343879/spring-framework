package com.mg.test;

import com.mg.bean.BeanA;
import com.mg.bean.BeanB;
import com.mg.bean.BeanC;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * IBeanTest class
 *
 * @author 谢小平
 * @date 2020-09-21
 */

public class BeanBTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.mg");
		annotationConfigApplicationContext.refresh();
		BeanB ibean = (BeanB) annotationConfigApplicationContext.getBean("xxpbean");
//				IBean ibean =  annotationConfigApplicationContext.getBean(IBean.class);

		System.out.println(ibean);
		System.out.println(ibean.getBeanA());
		System.out.println(annotationConfigApplicationContext.getBean("beanAspect"));
	}

	@Test
	public void getBean() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.mg");
		annotationConfigApplicationContext.refresh();
//		annotationConfigApplicationContext.lay
		BeanA beanA = (BeanA) annotationConfigApplicationContext.getBean("beanA");
		BeanB beanB = (BeanB) annotationConfigApplicationContext.getBean("beanB");
		BeanC beanC = (BeanC) annotationConfigApplicationContext.getBean("beanC");

		System.out.println(beanA.getBeanB());
		System.out.println(beanB.getBeanA());
		System.out.println(beanC.getName());

	}
}

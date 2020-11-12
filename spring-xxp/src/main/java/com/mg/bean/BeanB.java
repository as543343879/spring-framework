package com.mg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * IBeanTest class
 *
 * @author 谢小平
 * @date 2020-09-21
 */
@Component("beanB")
@Lazy
public class BeanB {
	@Autowired
	BeanA beanA;

	private String name = "mg";
	private String id = "1";



	public BeanA getBeanA() {
		return this.beanA;
	}


}

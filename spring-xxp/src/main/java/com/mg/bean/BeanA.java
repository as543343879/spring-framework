package com.mg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * BeanA class
 *
 * @author 谢小平
 * @date 2020-10-12
 */
@Component("beanA")
@Lazy
public class BeanA {
	@Autowired
	BeanB beanB;


	private String name = "mg";

	public BeanB getBeanB() {
		return beanB;
	}
}

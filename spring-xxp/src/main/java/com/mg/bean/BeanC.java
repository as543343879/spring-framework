package com.mg.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * BeanC class
 *
 * @author 谢小平
 * @date 2020-10-17
 */
@Component
@Lazy
@Scope("prototype")
public class BeanC {
	private String name;

	public String getName() {
		return name;
	}
}

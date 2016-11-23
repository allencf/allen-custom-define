package com.allen.custom.define;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 自定义实现xml解析的入口 
 * All rights Reserved, Designed By HQYG
 * Copyright:   Copyright(C) 2016
 * Company:     HQYG.
 * author:      cf
 * Createdate:  2016年11月23日下午3:39:15
 */
public class TestNamespanceHandlerSupport extends NamespaceHandlerSupport {

	@Override
	public void init() {
		//注册beanDefintionParser
		registerBeanDefinitionParser("testBean", new TestBeanDefinitionParser());
	}

}

package com.allen.custom.define;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import com.allen.custom.cfg.CustomDefineBean;


/**
 * 自定义beanDefintionParser的实现
 * All rights Reserved, Designed By HQYG
 * Copyright:   Copyright(C) 2016
 * Company:     HQYG.
 * author:      cf
 * Createdate:  2016年11月23日下午3:26:45
 */
public class TestBeanDefinitionParser implements BeanDefinitionParser {
	
	@Override
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		RootBeanDefinition def = new RootBeanDefinition();
		//设置bean classs
		def.setBeanClass(CustomDefineBean.class);
		
		//注册id属性
		String id = element.getAttribute("id");
		BeanDefinitionHolder idHolder = new BeanDefinitionHolder(def , id);
		BeanDefinitionReaderUtils.registerBeanDefinition(idHolder, parserContext.getRegistry());
		
		
		//注册name属性
		String modelName = element.getAttribute("modelName");
		BeanDefinitionHolder nameHolder = new BeanDefinitionHolder(def , modelName);
		BeanDefinitionReaderUtils.registerBeanDefinition(nameHolder, parserContext.getRegistry());
		
		//注册address属性
		String address = element.getAttribute("address");
		BeanDefinitionHolder addressHolder = new BeanDefinitionHolder(def , address);
		BeanDefinitionReaderUtils.registerBeanDefinition(addressHolder, parserContext.getRegistry());
		
		//注册port属性
		String port = element.getAttribute("port");
		BeanDefinitionHolder portHolder = new BeanDefinitionHolder(def , modelName);
		BeanDefinitionReaderUtils.registerBeanDefinition(portHolder, parserContext.getRegistry());
				
		def.getPropertyValues().addPropertyValue("modelName", modelName);
		def.getPropertyValues().addPropertyValue("address", address);
		def.getPropertyValues().addPropertyValue("port", port);
		
		return def;
	}

}

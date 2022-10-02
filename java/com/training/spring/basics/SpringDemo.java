package com.training.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
	
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			 FirstBean first = (FirstBean) context.getBean("FirstBean");
		        first.displayValue();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
//		BeanFactory factory = new DefaultListableBeanFactory();
//
//        BeanDefinitionRegistry reg = (BeanDefinitionRegistry) factory;
//
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
//
//        reader.loadBeanDefinitions(new ClassPathResource("studentconfig.xml"));

	}

}

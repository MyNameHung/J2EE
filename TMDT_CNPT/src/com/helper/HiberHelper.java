package com.helper;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HiberHelper {
	static Resource rs = new ClassPathResource(
			"com/configure/applicationContext.xml");
	
	static BeanFactory factory = new XmlBeanFactory(rs);
	
	static Helper helper = (Helper) factory.getBean("helper");

	public static List ToList(String query) {
		return helper.ToList(query);
	}

	public static boolean Save(Object obj) {
		return helper.Save(obj);
	}

	public static boolean Remove(Object obj) {
		return helper.Remove(obj);
	}

	public static String Error() {
		return helper.error;
	}
}

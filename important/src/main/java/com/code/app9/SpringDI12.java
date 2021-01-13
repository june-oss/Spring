package com.code.app9;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringDI12 {

	
	public DataSource getDataSource() {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context12.xml");
		return (DataSource)ac.getBean("dataSource");
	}
	
}

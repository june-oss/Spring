package com.code.app14;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringDI14 {

	
	public SqlSessionFactory getSqlFactory() {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context14.xml");
		return (SqlSessionFactory)ac.getBean("sqlSessionFactory");
	}
	
}

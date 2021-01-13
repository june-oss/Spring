package com.code.app;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.code.app14.SpringDI14;
import com.code.app15.UserDAO;
import com.code.app15.UserVO;
import com.code.app9.SpringDI12;

import lombok.extern.log4j.Log4j;

@Log4j
public class SpringDI11 {

	
	@Test
	public void test() {
		com.code.app9.SpringDI11 db = new com.code.app9.SpringDI11();
		try {
			db.connect();
			
			log.info(db);
			log.info(db.getCon());
			Statement stmt = null;

			ResultSet rs = null;
			stmt = db.getCon().createStatement(); // Statement를 가져온다.
			String query = "SELECT sysdate FROM dual";
			rs = stmt.executeQuery(query);
			while (rs.next()) {

			String curDate = rs.getString(1);

			System.out.println(curDate);

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				db.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void testdataSource() {
		
		
		SpringDI12 spring =new SpringDI12();
		DataSource ds = spring.getDataSource();
		
		try(Connection con = ds.getConnection()){
			log.info(con);
		}catch (Exception e) {
			fail(e.getMessage());
		}
		
		
	}
	@Test
	public void testSqlSessionFactory() {
		
		SpringDI14 spring = new SpringDI14();
		SqlSessionFactory factory = spring.getSqlFactory();
		try(SqlSession session = factory.openSession()){
			log.info(session);
		}catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testSqlSessionTest() {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context14.xml");
		
		try(SqlSession session = ((SqlSessionFactory)ac.getBean("sqlSessionFactory")).openSession();
				Connection con = session.getConnection();){
			log.info(session);
			log.info(con);
		}catch (Exception e) {
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testSqlSessionTemplete() throws Exception{
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context15.xml");
		UserDAO dao = (UserDAO)ac.getBean(UserDAO.class);
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testUserInsert() throws Exception{
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context15.xml");
		UserDAO dao = (UserDAO)ac.getBean(UserDAO.class);
		UserVO vo = new UserVO();
		vo.setUserId("123");
		vo.setPassword("123");
		vo.setEmail("aaa@aaa");
		vo.setName("이현중");
		
		dao.insert(vo);
	}
}

package com.code.app9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.logging.annotations.Log;

public class SpringDI11 {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String name = "student";
	private String password = "1234";
	private Connection con;
	
	private void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connect() throws SQLException {
		init();
		con = DriverManager.getConnection(url, name, password);
	}
	
	public void close() throws SQLException {
		con.close();
	}
	
	public Connection getCon() {
		return con;
	}
}

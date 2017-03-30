package com.ukyi.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

//JDBC 연결테스트
public class OracleConnectionTest {
	private static final String Driver = "oracle.jdbc.driver.OracleDriver";
	private static final String Url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String User = "scott";
	private static final String Pw = "tiger";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(Driver);
		try {
			Connection con = DriverManager.getConnection(Url,User,Pw);
					System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

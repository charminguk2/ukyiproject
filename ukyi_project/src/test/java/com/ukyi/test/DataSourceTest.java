package com.ukyi.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"}) //해당경로에 xml파일을이용해 스프링 로딩.
public class DataSourceTest {
	
	@Inject //root-context.xml에 있는 DataSource 주입
	private DataSource ds;
	
	@Test
	public void testConection() throws Exception{
		Connection con;
		try {
			con = ds.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
		}
	}
}

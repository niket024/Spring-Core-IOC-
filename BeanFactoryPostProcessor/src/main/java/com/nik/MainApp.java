package com.nik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String[] args) throws Exception
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		DBUtil dbUtil = (DBUtil) context.getBean("dataSource");
		Connection connection = dbUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sql = "select * from student";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
	/*		System.out.println(rs.getInt(4));
			System.out.println(rs.getString(5));*/
			System.out.println("--------------");
		}
		System.out.println(connection);
		context.close();

	}
}
package com.nik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
	private static String URL;
	private static String DRIVERCLASS;
	private static String USERNAME;
	private static String PASSWORD;

	public String getURL()
	{
		return URL;
	}

	public void setURL(String uRL)
	{
		URL = uRL;
	}

	public void setDRIVERCLASS(String dRIVERCLASS)
	{
		DRIVERCLASS = dRIVERCLASS;
	}

	public void setUSERNAME(String uSERNAME)
	{
		USERNAME = uSERNAME;
	}

	public void setPASSWORD(String pASSWORD)
	{
		PASSWORD = pASSWORD;
	}

	public Connection getConnection()
	{
		Connection connection = null;
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}

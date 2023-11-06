package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/election";
	public static final String DB_USER = "80458";
	public static final String DB_PASSWORD = "80458";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnection() throws Exception
	{
		Connection con= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return con;
	}
	}

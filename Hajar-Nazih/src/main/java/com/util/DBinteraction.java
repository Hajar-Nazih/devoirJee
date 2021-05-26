package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinteraction {
	private static String  url="jdbc:mysql://localhost:3308/hajarnazih";
	private static Connection conn;
	private static Statement st;
	static ResultSet res;
	public static void connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

					 conn=DriverManager.getConnection(url, "root" , "");
			         st = conn.createStatement();
		}catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
		



	public static  int Maj(String sql)
	{
		int nb=0;
		try{ 
			 nb= st.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();}
		return nb ;
	}
	
	public static  ResultSet select(String sql) {
		try {
		 res= st.executeQuery(sql);
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return res;
	}

	public static void disconnect() {
		 try{
			 conn.close();
		 }catch(SQLException e) {
				e.printStackTrace();}
		 
	}

}

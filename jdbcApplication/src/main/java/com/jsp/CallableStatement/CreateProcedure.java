package com.jsp.CallableStatement;

import java.sql.*;

public class CreateProcedure {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001", "root", "root");
		Statement st = con.createStatement();
		st.execute("create procedure `fetch` () \n" + "begin \n" + "select * from user; \n" + "end");
		System.out.println("Procedure created successfully");
	}

}

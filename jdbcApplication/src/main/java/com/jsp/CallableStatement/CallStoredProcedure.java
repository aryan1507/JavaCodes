package com.jsp.CallableStatement;

import java.sql.*;

public class CallStoredProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","root");
		CallableStatement cs = con.prepareCall("{call `fetch`()}");
		
		ResultSet rs = cs.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.println();
		}
	}

}

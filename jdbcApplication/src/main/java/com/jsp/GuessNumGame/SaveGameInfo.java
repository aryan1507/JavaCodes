package com.jsp.GuessNumGame;

import java.sql.*;

public class SaveGameInfo {
	public static void saveData(int id, String name, String sgn, String uen, int score, Timestamp startedat) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into game(id,name,sgn,uen,score,startedat) values(?,?,?,?,?,?);");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3, sgn);
		ps.setString(4, uen);
		ps.setInt(5, score);
		ps.setTimestamp(6, startedat);
		
		ps.execute();
		
		System.out.println("Your Final Score: "+score);
	}
}

package com.jsp.BatchProcessing;

import java.sql.*;

public class StatementWithBatchProcessing {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","root");
        Statement st = con.createStatement();
        st.addBatch("insert into user(id, name, email, password) values(1,'Tom','venom@gmail.com','fsdfsa')");
        st.addBatch("insert into user(id, name, email, password) values(2,'Thomas','shelby@gmail.com','sdfjssk')");
        st.addBatch("update user set id=3 where password='fsdfsa'");
        st.addBatch("delete from user where id = 3");
        st.executeBatch();
        System.out.println("Batch executed successfully");
    }
}

package com.jsp.PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class InsertUserDynamically {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","root");
        PreparedStatement ps = con.prepareStatement("insert into user(id,name,email,password) values(?,?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,email);
        ps.setString(4,password);
        ps.execute();
        System.out.println("Data inserted successfully");
    }
}

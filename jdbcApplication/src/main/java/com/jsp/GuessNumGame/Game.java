package com.jsp.GuessNumGame;

import java.sql.*;
import java.util.*;

public class Game {

	public static void main(String[] args) throws Exception{
		int score = 0;
		List<Integer> sgn = new ArrayList();
		List<Integer> uen = new ArrayList();
		
		Scanner scn = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001", "root", "root");
		
		System.out.println("Enter id: ");
		int id = scn.nextInt();
		System.out.println("Enter name: ");
		String name = scn.next();
		Timestamp startedat = new Timestamp(System.currentTimeMillis());
		for(int i=0;i<3;i++) {
			Random r = new Random();
			int rnum = r.nextInt(10);			
			System.out.println("Guess the Number: ");
			int usernum = scn.nextInt();			
			if(usernum == rnum) {
				score += 10; 
			}
			sgn.add(rnum);
			uen.add(usernum);
		}
		SaveGameInfo.saveData(id, name, sgn+"", uen+"", score, startedat);
	}

}

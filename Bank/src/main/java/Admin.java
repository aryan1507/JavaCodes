import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Admin {

	public void addAccount() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		Random r = new Random();
		long accountNum = (long) (r.nextDouble() * 1_000_000_000_000L);
		System.out.println("Account Number: "+accountNum);
		System.out.print("Enter pincode: ");
		int pincode = sc.nextInt();
		System.out.print("Enter balance: ");
		double bal = sc.nextDouble();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter Mobile Number: ");
		long mobileNum = sc.nextLong();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into account(id,accountNum,pincode,bal,name,mobileNum) values(?,?,?,?,?,?)");
		
		ps.setInt(1, id);
		ps.setLong(2, accountNum);
		ps.setInt(3, pincode);
		ps.setDouble(4, bal);
		ps.setString(5, name);
		ps.setLong(6, mobileNum);
		ps.execute();
		System.out.println("Account added successfully\n");
	}
	
	public void viewAccount() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number whose data to fetch: ");
		long accountNum = sc.nextLong();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from account where accountNum=?");
		ps.setLong(1,accountNum);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		System.out.println("id="+rs.getInt(1));
		System.out.println("Account Number="+rs.getLong(2));
		System.out.println("Pin code="+rs.getInt(3));
		System.out.println("Available Balance="+rs.getLong(4));
		System.out.println("Account Holder Name="+rs.getString(5));
		System.out.println("Mobile Number=" + rs.getLong(6));
		System.out.println("Account Fetched Successfully\n");
	}
	
	public void viewAllAccounts() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement st = con.prepareStatement("select * from account");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getLong(2) + "\t");
			System.out.print(rs.getInt(3) + "\t");
			System.out.print(rs.getLong(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getLong(6) + "\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		
		Admin a = new Admin();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from admin where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		int c=0;
		if(rs.next()) {
			c=2;
			System.out.println("Welcome Admin!");
		}
		else {
			c=1;
			System.out.println("User Not Found");
		}
		while(true) {
			switch(c) {
					case 1:
						System.out.println("Register User");
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						System.out.print("Enter name: ");
						String name = sc.next();
						System.out.print("Enter email: ");
						String Email = sc.next();
						System.out.print("Enter password: ");
						String pswd = sc.next();
						PreparedStatement ps1 = con.prepareStatement("insert into admin(id,name,email,password) values(?,?,?,?)");
						ps1.setInt(1, id);
						ps1.setString(2, name);
						ps1.setString(3, Email);
						ps1.setString(4, pswd);
						ps1.execute();
						System.out.println("User created successfully\n");
						break;
						
					case 2:
							System.out.print("Select one of the following options:\n 1. Add Account \n 2. View Account Details \n 3. View All Accounts Details \n 4. Exit \n");
							int ch = sc.nextInt();
							switch(ch) {
								case 1:
									a.addAccount();
									break;
								case 2:
									a.viewAccount();
									break;
								case 3:
									a.viewAllAccounts();
									break;
								case 4:
									return;
								default:
									System.out.println("Invalid! Select the option between 1 to 4");
							}
							break;
					default:
						System.out.println("Invalid! Select the option between 1 and 2");
			}
		}
	}
}

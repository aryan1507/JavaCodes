import java.util.Scanner;
import java.sql.*;

public class Account {
	public void depositMoney(long accNum, double amt) throws Exception{		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("select bal from account where accountNum = ?;");
		ps.setLong(1, accNum);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
				amt += rs.getDouble(1);
				PreparedStatement ps1 = con.prepareStatement("update account set bal = ? where accountNum = ?;");
				ps1.setDouble(1, amt);
				ps1.setLong(2,accNum);
				ps1.execute();
				System.out.println("Money deposited successfully");
		}
		else {
			System.out.println("Invalid credentials!");
		}
	}
	
	public void sendMoney(long accNum, long raccNum, double amt) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement st1 = con.prepareStatement("select bal from account where accountNum = ?;");		
		st1.setLong(1, accNum);
		ResultSet rs1 = st1.executeQuery();
		PreparedStatement st2 = con.prepareStatement("select bal from account where accountNum = ?;");
		st2.setLong(1, raccNum);
		ResultSet rs2 = st2.executeQuery();
		
		if(rs1.next() && rs2.next()) {
			if(amt > rs1.getDouble(1)) {
				System.out.println("Insufficient Balance!");
			}
			else {
				double newBal = rs1.getDouble(1);
				newBal -= amt;
				PreparedStatement ps1 = con.prepareStatement("update account set bal=? where accountNum = ?;");
				ps1.setDouble(1, newBal);
				ps1.setLong(2, accNum);
				ps1.execute();
				
				double rBal = rs2.getDouble(1);
				rBal += amt;
				PreparedStatement ps2 = con.prepareStatement("update account set bal=? where accountNum = ?;");
				ps2.setDouble(1,rBal);
				ps2.setLong(2,raccNum);
				ps2.execute();
				System.out.println("Amount sent successfully");
			}
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
		
	public void withdrawMoney(long accNum, double amt) throws Exception{		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("select bal from account where accountNum = ?;");
		ps.setLong(1, accNum);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			if(amt > rs.getDouble(1)) {
				System.out.println("Insufficient Balance!");
			}
			else {
				double newbal = rs.getDouble(1);
				newbal -= amt;
				PreparedStatement ps1 = con.prepareStatement("update account set bal = ? where accountNum = ?;");
				ps1.setDouble(1, newbal);
				ps1.setLong(2, accNum);
				ps1.execute();
				System.out.println("Money withdrawn successfully, Current Balance= "+newbal);
			}
		}
	}	
	
	public void updateProfile(long accNum) throws Exception {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter new pincode: ");
		int pincode = sc.nextInt();
		System.out.print("Enter new Mobile Number: ");
		long mobileNum = sc.nextLong();
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("update account set pincode=?,mobileNum=? where accountNum=?");	
		ps.setInt(1, pincode);
		ps.setLong(2, mobileNum);
		ps.setLong(3, accNum);
		ps.execute();
		System.out.println("Account details updated successfully");
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		long accountNum = sc.nextLong();
		System.out.print("Enter pincode: ");
		int pincode = sc.nextInt();
		Account acc = new Account();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from account where accountNum=? and pincode=?");
		ps.setLong(1,accountNum);
		ps.setInt(2,pincode);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println("Welcome!");
			while(true) {
				System.out.println("Select the following options:\n 1. Deposit Money \n 2. Send Money \n 3. Withdraw Money \n 4. Update Profile \n 5. Exit");
				int ch = sc.nextInt();
				switch(ch) {
					case 1:
						System.out.print("Enter the amount to deposit: ");
						double amt = sc.nextDouble();
						acc.depositMoney(accountNum, amt);
						break;
					case 2:
						System.out.print("Enter the receiver's account number: ");
						long raccNum = sc.nextLong();
						System.out.print("Enter the amount to send: ");
						double amount = sc.nextDouble();
						acc.sendMoney(accountNum, raccNum, amount);
						break;
					case 3:
						System.out.print("Enter the amount to withdraw: ");
						double Amt = sc.nextDouble();
						acc.withdrawMoney(accountNum, Amt);
						break;
					case 4:
						acc.updateProfile(accountNum);
						break;
					case 5:
						return;
					default:
						System.out.println("Invalid! Enter between 1 to 5");
				}
			}
		}
		else {
			System.out.println("User is not found!");
		}
	}
}

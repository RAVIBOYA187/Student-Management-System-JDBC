package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Student_Management.UserFeatures;

public class AdminLogin {

	public static void adminLogin() {
		
		// Admin only can login with email & password
		Scanner sc = new Scanner(System.in);
		
		System.out.println("for Login as Admin.... please enter below details....");

		System.out.println("Enter Admin eamil : ");
		String email = sc.nextLine();
		
		System.out.println("Enter Admin password : ");
		String password = sc.nextLine();
		
//		sc.nextLine();
		// code for email, password check jdbc
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("select Admin_email, Admin_password, Admin_name from admin");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(1).equals(email) && rs.getString(2).equals(password)) {
					String name = rs.getString(3);
					System.out.println("Congrats Admin ..." + name + " your Login Successfull...");
					AdminFeatures.adminFeatures(email);
					break;
				}
			}
			
			System.err.println("sorrryy...Admin login faileeddd...");
			System.out.println("please enter correct email and password ...");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			}
		finally {
			if( rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if( ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if( con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

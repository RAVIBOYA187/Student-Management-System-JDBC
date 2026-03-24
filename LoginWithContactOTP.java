package Student_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginWithContactOTP {

	public static void loginWithContactOTP() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("for login to your account.... please enter below details....");

		System.out.println("Enter student contact number : ");
		long contact = sc.nextLong();
		
		int otp = (int)( Math.random() * 10000 );
		
		System.out.println("Your OTP is : " + otp );
		
		
		System.out.println("Enter Your OTP : ");
		int user_otp = sc.nextInt();
		
		// jdbc code for contacts checking 
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("select contact, name, email from student");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if(rs.getLong(1) == contact && user_otp == otp) {
					System.out.println("Congrats...	" + rs.getString(2) + "	your Login Successfull...");
					String email = rs.getString(3);
					UserFeatures.userFeatures(email);
					break;
				}
			}
			
//			System.out.println("sorrryy... login faileeddd...");
			System.out.println("");
			System.err.println("sorrryy... login faileeddd...");
			System.out.println("please enter correct contact and OTP ...");
			
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

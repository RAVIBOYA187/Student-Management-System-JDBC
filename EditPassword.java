package Student_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditPassword {
	
	
	public static void editPassword(String email) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Correct password : ");
		String password = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("update student set password = ? where email = ?");
			ps.setString(1,password);
			ps.setString(2, email);
			ps.executeUpdate();
			
			System.out.println("Your password Updated Succeessfullyy....");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
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

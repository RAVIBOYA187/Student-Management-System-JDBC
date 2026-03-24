package Student_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditContact {
	
	public static void editContact(String email) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Correct Contact Number : ");
		long contact = sc.nextLong();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("update student set contact = ? where email = ?");
			ps.setLong(1,contact);
			ps.setString(2, email);
			ps.executeUpdate();
			
			System.out.println("Your contact Updated Succeessfullyy....");
			
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

package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Student_Management.UserFeatures;

public class EditMarks {
	
	public static void editMarks(String email) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Correct Name : ");
		double new_marks = sc.nextDouble();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("update student set marks = ? where email = ?");
			ps.setDouble(1,new_marks);
			ps.setString(2, email);
			ps.executeUpdate();
			
			System.out.println("Your marks Updated Succeessfullyy....");
			
			AdminFeatures.adminFeatures(email);
			
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

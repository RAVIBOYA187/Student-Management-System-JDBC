package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAllStudentsByAdmin {

	
	public static void viewAllStudentsByAdmin(String email){
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("select * from student");
			rs = ps.executeQuery();
			
			System.out.println("All the students details are ......");

			
			while(rs.next()) {
			
				System.out.println("---------------------------------");
				System.out.println("|	id	:	" + rs.getInt(1)  + "	|");
				System.out.println("| 	name	:	" + rs.getString(2) + "	|");
				System.out.println("|	address	:	" + rs.getString(3) + "	|");
				System.out.println("|	contact :	" + rs.getLong(4) + "	|");
				System.out.println("|	email	:	" + rs.getString(5) + "	|");
				System.out.println("|	password	:	" + rs.getString(6) + "	|");
				System.out.println("|	marks	:	" + rs.getDouble(7) + "	|");
				System.out.println("---------------------------------");
				
			}
//			can i call this method here only or at adminFeatures() (it's caller)
			AdminFeatures.adminFeatures(email);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(rs != null) {
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


package Student_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateStudentAccount {
	
public static void createStudentAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("for creating your account.... please enter below details....");
		
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student Name : ");
		String name = sc.nextLine();
	
		System.out.println("Enter student address : ");
		String address = sc.nextLine();
		
		System.out.println("Enter student contact number : ");
		long contact = sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter student eamil : ");
		String email = sc.nextLine();
		
		System.out.println("Enter student password : ");
		String password = sc.nextLine();
		
//		sc.nextLine();
		
		System.out.println("Enter student marks : ");
		double marks = sc.nextDouble();
		
		
		// code for db connection ... jdbc
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
			
			ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setLong(4, contact);
			ps.setString(5, email);
			ps.setString(6, password);
			ps.setDouble(7, marks);
			ps.execute();
			
			System.out.println("student account created succeessfullyy...");
			
			
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

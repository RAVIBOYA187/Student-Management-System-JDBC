package Admin;

import java.util.Scanner;

import Student_Management.DeleteDetailsByStudent;
import Student_Management.EditNameByStudent;
import Student_Management.ViewStudentDetails;

public class AdminFeatures {

	public static void adminFeatures(String email) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	View All Students Details ");
		System.out.println("	2.	Fetch / Find Students Using ids");
		System.out.println("	3.	Fetch / Find Students Using Emails");
		System.out.println("	4.	Edit / Update Student details");
		System.out.println("	5.	Delete Student details");
		System.out.println(" 	6.	Go Back to Home Page / Logout");
		System.out.println(" 	7.	Exit");
		
		int admin_choice = sc.nextInt();
		sc.nextLine();
		
		switch (admin_choice) {
			case 1: {
				ViewAllStudentsByAdmin.viewAllStudentsByAdmin(email);
				adminFeatures(email);
			}
			case 2: {
				FetchStudentsUsingIds.fetchStudentsUsingIds(email);
				adminFeatures(email);
			}
			case 3:{
					FetchStudentsUsingEmails.fetchStudentsUsingEmails(email);
					adminFeatures(email);
				}
			case 4: {
				EditOptionsForAdmin.editOptionsForAdmin(email);
			}
			case 5:{
				DeleteStudentsByIds.deleteStudentsByIds(email);
			}
			case 6: {
				HomePage.homePage();		
			}
			case 7:{
				System.out.println("Thank you.. Visit Again...");
				System.exit(1);
			}
			default:
				System.err.println("enter a valid option");
				adminFeatures(email);
		}
	}
	
}

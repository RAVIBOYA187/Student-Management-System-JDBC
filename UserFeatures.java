package Student_Management;

import java.util.Scanner;

public class UserFeatures {
	
	public static void userFeatures(String email) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	View Your Details ");
		System.out.println("	2.	Edit / Update Your details");
		System.out.println("	3.	Delete Your details");
		System.out.println(" 	4.	Go Back to Home Page / Logout");
		System.out.println(" 	5.	Exit");
		
		int user_choice = sc.nextInt();
		sc.nextLine();
		
		switch (user_choice) {
			case 1: {
				ViewStudentDetails.viewStudentDetails(email);
				userFeatures(email);
			}
			case 2: {
				EditOptionsForStudentDetails.editOptionsForStudentDetails(email);
//				userFeatures(email);
					}
			case 3: {
				DeleteDetailsByStudent.deleteDetailsByStudent(email);
//				StudentDriver.option();
			}
			case 4: {
				StudentMenu.studentMenu();	
			}
			case 5:{
				System.exit(1);
			}
			default:
				System.err.println("enter a valid option");
				userFeatures(email);
		}
	}
}

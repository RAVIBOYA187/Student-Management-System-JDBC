package Student_Management;

import java.util.Scanner;

public class EditOptionsForStudentDetails {

	
	public static void editOptionsForStudentDetails(String email) {
		// by using id
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	Edit Name ");
		System.out.println(" 	2.	Edit Contact");
		System.out.println("	3.	Edit Email id ");
		System.out.println("	4.	Edit Password");
		
		int student_choice = sc.nextInt();
		sc.nextLine();
		
		switch (student_choice) {
			case 1: {
				EditNameByStudent.editNameByStudent(email);
				UserFeatures.userFeatures(email);
			}
			case 2: {
				EditContact.editContact(email);
				UserFeatures.userFeatures(email);
			}
			case 3:{
				EditEmail.editEmail(email);
				UserFeatures.userFeatures(email);
			}
			case 4:{
				EditPassword.editPassword(email);
				UserFeatures.userFeatures(email);
			}
			default:{
				System.out.println("please enter valid option ....");
				editOptionsForStudentDetails(email);
			}
		}
	}
}

package Admin;

import java.util.Scanner;

import Student_Management.EditContact;
import Student_Management.EditEmail;
import Student_Management.EditNameByStudent;
import Student_Management.EditPassword;
import Student_Management.UserFeatures;

public class EditOptionsForAdmin {
	
	public static void editOptionsForAdmin(String email) {
		// by using email
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	Edit Name ");
		System.out.println(" 	2.	Edit Contact");
		System.out.println("	3.	Edit Email id ");
		System.out.println("	4.	Edit Password");
		System.out.println("	5.	Edit marks ");
		
		
		int student_choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("please enter student email id : ");
		String student_email = sc.nextLine();
		
		switch (student_choice) {
			case 1: {
				EditNameByStudent.editNameByStudent(student_email);
				AdminFeatures.adminFeatures(email);
				break;
			}
			case 2: {
				EditContact.editContact(student_email);
				AdminFeatures.adminFeatures(email);
				break;
			}
			case 3:{
				EditEmail.editEmail(student_email);
				AdminFeatures.adminFeatures(email);
				break;
			}
			case 4:{
				EditPassword.editPassword(student_email);
				AdminFeatures.adminFeatures(email);
				break;
			}
			case 5:{
				EditMarks.editMarks(student_email);
				AdminFeatures.adminFeatures(email);
				break;
			}
			default:{
				System.out.println("please enter a valid option ....");
				editOptionsForAdmin(email);
			}
		}
	}

}

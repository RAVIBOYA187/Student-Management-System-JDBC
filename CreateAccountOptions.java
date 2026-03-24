package Student_Management;

import java.util.Scanner;

public class CreateAccountOptions {
	
public static void createAccountOptions() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	YES ... create account ");
		System.out.println("	2.	NO .. Go Back to home page ");
		
		System.out.println();
		int create_options = sc.nextInt();
		
		switch (create_options) {
			case 1: {
				CreateStudentAccount.createStudentAccount();
				StudentMenu.studentMenu();
			}
			case 2:{
				StudentMenu.studentMenu();
			}
			default:
				System.err.println("enter a valid option");
				createAccountOptions();
			}
	}
}



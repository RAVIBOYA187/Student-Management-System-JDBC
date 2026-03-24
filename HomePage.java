package Admin;

import java.util.Scanner;

import Student_Management.StudentMenu;

public class HomePage {
	public static void homePage() {
		
		System.out.println("...wellcome to student management system........");

		boolean flag = true;
		
		while(flag) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Select your choice to proceed .... ");
			System.out.println("	1.	Admin ");
			System.out.println("	2.	User ");
			System.out.println("	3.	Exit ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1: {
//					AdminLogin.adminLogin();
					AdminOptions.adminOptions();
					break;
				}
				case 2:{
					StudentMenu.studentMenu();
					break;
				}
				case 3:{
					System.out.println("thank you.. visit again...");
					System.exit(1);
					break;
				}
				default:
					System.err.println("enter a valid option");
					homePage();
			}
		}
		
	}
}

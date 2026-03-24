package Student_Management;

import java.util.Scanner;

import Admin.HomePage;

public class StudentMenu {
	
public static void studentMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an option to proceed : ");
		System.out.println("	1.	Create Account ");
		System.out.println("	2.	Login");
		System.out.println("	3.	Go Back to Home Page ");
		System.out.println("	4.	Exit ");
		
		int student_choice = sc.nextInt();
		
		switch (student_choice) {
			case 1: {
				CreateAccountOptions.createAccountOptions();
				break;
			}
			case 2:{
				StudentLoginFeatures.studentLoginFeatures();
				break;
			}
			case 3:{
				HomePage.homePage();
				break;
			}
			case 4:{
				System.out.println("thank you.. visit again...");
				System.exit(1);
			}
			default:{
				System.err.println("enter a valid option");
				StudentMenu.studentMenu();
			}
		}
	}

}

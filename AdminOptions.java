package Admin;

import java.util.Scanner;

public class AdminOptions {
	
	public static void adminOptions() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your choice to proceed .... ");
		System.out.println("	1.	Login ");
		System.out.println("	2.	Go Back to Home Page ");
		System.out.println("	3.	Exit ");
		
		int admin_choice = sc.nextInt();
		sc.nextLine();
		
		switch (admin_choice) {
			case 1: {
				AdminLogin.adminLogin();
				break;
			}
			case 2:{
				HomePage.homePage();
				break;
			}
			case 3:{
				System.out.println("thank you.. visit again...");
				System.exit(1);
				break;
			}
			default:
				System.err.println("enter a valid option");
				adminOptions();
		}	
	}
}

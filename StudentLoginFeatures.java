package Student_Management;

import java.util.Scanner;

public class StudentLoginFeatures {

	
	public static void studentLoginFeatures() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your choice to proceed .... ");
		System.out.println("	1.	Login with Email & Password ");
		System.out.println("	2.	Login with Mobile & OTP ");
		System.out.println("	3.	Go Back to Home Page ");
		System.out.println("	4.	Exit ");
		
		int login_option = sc.nextInt();
		sc.nextLine();
		
		switch (login_option) {
			case 1:{
				LoginWithEamilPassword.loginWithEamilPassword();
			}
			case 2:{
				LoginWithContactOTP.loginWithContactOTP();
			}	
			case 3:{
				StudentMenu.studentMenu();
				break;
			}
			case 4:
				System.exit(0);
			default:{
				System.err.println("enter a valid option");
				studentLoginFeatures();
				break;
			}
				
		}
	}
}


package email_system;

import java.util.Scanner;

public class EmailModel {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private String companyAbr = "droloe.com";
	
	
	public String getFullName() {
		return firstName +" "+ lastName;
	}
	
	public void setFullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Department Codes\n1 for Art\n2 for Biochemistry\n3 for Accounting\nEnter department code: ");
			int deptChoice = scanner.nextInt();
			
			if(deptChoice == 1) {
				this.department = "art";
			} else if (deptChoice == 2) {
				this.department = "biochemistry";
			} else if (deptChoice == 3) {
				this.department = "accounting";
			} else {
				this.department = "none";
			}
				
		}
	}

	public String getPassword() {
		return password;
	}
	
	public void generateRandomPassword(int length) {
		String passwordGen = "ABCDEFGHIJKLMNOPQRSTTUVWXYZ@&%$12946738";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int randomPassword = (int) (Math.random() * passwordGen.length());
			password[i] = passwordGen.charAt(randomPassword);
		}
		
		this.password = new String(password);
	}

	public String getEmail() {
		return email;
	}
	
	public void generateEmail() {
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() 
		+ "@" + this.department + "." + this.companyAbr;
	}
}

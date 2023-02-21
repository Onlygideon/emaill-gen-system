package email_system;

public class EmailView {
	public void showUserDetais(String fullName, String email, String password, String department) {
		System.out.println("User Account Details: ");
		System.out.println("FullName: " + fullName);
		System.out.println("Email: " + email);
		System.out.println("Password " + password);
		System.out.println("Department " + department);
	}
}

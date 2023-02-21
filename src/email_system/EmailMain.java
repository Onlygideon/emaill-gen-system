package email_system;

public class EmailMain {

	public static void main(String[] args) {
		EmailModel model = getUser();
		EmailView view = new EmailView();
		EmailController controller = new EmailController(model, view);
		
		controller.showDetails();
		
		
		// update user info
		controller.generateRandomPassword();
		
		System.out.println("\nUpdated user info: ");
		
		controller.showDetails();
		
	}
	
	private static EmailModel getUser() {
		EmailModel user = new EmailModel();
		user.setFullName();
		user.setDepartment();
		user.generateEmail();
		user.generateRandomPassword(8);
		return user;
	}

}

package email_system;

public class EmailMain {

	public static void main(String[] args) {
		EmailModel model = getUser();
		EmailView view = new EmailView();
		EmailController controller = new EmailController(model, view);
		
		controller.showDetails();
		
		
		// update user info
		controller.setFullName("john", "stock");
		controller.generateRandomPassword();
		
		System.out.println("\nUpdated user info: ");
		
		controller.showDetails();
		
	}
	
	private static EmailModel getUser() {
		EmailModel user = new EmailModel();
		user.setFullName("ian", "doe");
		user.setDepartment();
		user.generateEmail();
		user.generateRandomPassword(8);
		return user;
	}

}

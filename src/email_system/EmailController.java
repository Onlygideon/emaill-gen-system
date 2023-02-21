package email_system;


public class EmailController {
	private EmailModel model;
	private EmailView view;
	
	public EmailController(EmailModel model, EmailView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFullName() {
		model.setFullName();
	}
	
	public String getFullName() {
		return model.getFullName();
	}
	
	public void setDepartment() {
		model.setDepartment();
	}
	
	public String getDepartment() {
		return model.getDepartment();
	}
	
	public void generateRandomPassword() {
		model.generateRandomPassword(8);
	}
	
	public String getPassword() {
		return model.getPassword();
	}
	
	public void generateEmail() {
		model.generateEmail();
	}

	public String getEmail() {
		return model.getEmail();
	}
	
	public void showDetails() {
		view.showUserDetais( model.getFullName(), model.getEmail(), model.getPassword(), model.getDepartment());
	}
}

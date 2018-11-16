package controller;

import ExcellenceDB.UserInformation;
import applicationui.SignUp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SignUpController {
	
	UserInformation ui = new UserInformation();
	
	@FXML
	TextField username,password,firstname,lastname,emailid,phonenumber;
	
	@FXML
	public void signUp(ActionEvent event)
	{
		ui.createUser(username.getText(), password.getText(), firstname.getText(), lastname.getText(), emailid.getText(), phonenumber.getText());
		SignUp.signUpStage.hide();
		System.out.println("Signed In");
	}

}

package controller;

import ExcellenceDB.UserInformation;
import applicationui.Application;
import applicationui.Login;
import applicationui.MainScreen;
import applicationui.SignUp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController 
{
	UserInformation ui = new UserInformation();

	@FXML
	Label loginMessage;

	@FXML
	TextField username, password;

	@FXML
	public void login(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("User Authentication");
		
		String un = username.getText().trim();
		String ps = password.getText();

		if (!un.isEmpty() || !ps.isEmpty()) {
			if (ui.isValidUser(un, ps)) {
				alert.setContentText("Valid User!");
				alert.showAndWait();
				Login.loginStage.close();
				MainScreen ms = new MainScreen();
				ms.launch();

			} else {
				alert.setContentText("Invalid Username or Invalid Password!");
				alert.showAndWait();
			}
		}
		else 
		{
			alert.setContentText("User Name or Password is empty");
			alert.showAndWait();
		}
	}

	@FXML
	public void signUp(ActionEvent event) {
		SignUp s = new SignUp();
		s.launch();
	}

	@FXML
	public void close(ActionEvent event) {
		Application.closeAllConnection();
		System.exit(0);

	}

}

package applicationui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUp {
	public static Stage signUpStage;

	public void launch() {
		try {
			signUpStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\SignUp.fxml"));
			Scene scene = new Scene(root);
			signUpStage.setScene(scene);
			signUpStage.show();

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package applicationui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login {
	
	public static Stage loginStage;

	public Login() throws Exception {
		launch();
	}

	public void launch() throws Exception {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		loginStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\LoginWindow.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("\\application.css").toExternalForm());
		loginStage.setScene(scene);
		Image anotherIcon = new Image("https://thumbs.dreamstime.com/b/green-tree-round-icon-vector-illustration-your-design-41386973.jpg");
		loginStage.getIcons().add(anotherIcon);
		loginStage.setTitle("User Authetication");
		loginStage.setOpacity(0.94);
		loginStage.setResizable(false);
		loginStage.centerOnScreen();
		loginStage.show();
		
		

	}

}

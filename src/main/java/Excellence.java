
import applicationui.Login;
import javafx.application.Application;
import javafx.stage.Stage;
import utility.ConnectDB;

public class Excellence extends Application {

	public static void main(String[] args) {
		
		ConnectDB.connect();
		launch(args);		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		new Login();
	}
	

	
}

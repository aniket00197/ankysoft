package applicationui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Health {
	
	
	public Parent healthUI()
	{
		Parent root=null;
		
		
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\Health.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return root;
	}

}

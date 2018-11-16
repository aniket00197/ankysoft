package applicationui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;

public class Wealth {
	
	public Parent wealthUI()
	{		
		Parent root = null;
		try {
			
			root = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\Wealth.fxml"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return root;
	}

}

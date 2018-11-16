package applicationui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FunctionList {
	
	public Parent functionUI()
	{
		Parent root = null;
				
				try {
					root = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\FunctionList.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return root;
	}

}

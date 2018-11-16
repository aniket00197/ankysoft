package applicationui;


import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainScreen {
	
	//public static BorderPane mainRoot;
	
	public static Stage stage;
	public static Wealth wealth;
	public static Health health;
	public static FunctionList fl;
	
	
	public void launch() 
	{
		try {
		//define variables
		stage = new Stage();
		
		//define inner windows
		wealth = new Wealth();
		fl = new FunctionList();
		
		
		Parent mainRoot;
	
			mainRoot = FXMLLoader.load(getClass().getClassLoader().getResource("\\Fxml\\Wealth.fxml"));
		
		//mainRoot = new BorderPane();
		//mainRoot.setCenter(wealth.wealthUI());
		//mainRoot.setLeft(fl.functionUI());
		Scene scene = new Scene(mainRoot);
		stage.setScene(scene);
		stage.setTitle("Personal Excellence");
		Image anotherIcon = new Image("https://thumbs.dreamstime.com/b/green-tree-round-icon-vector-illustration-your-design-41386973.jpg");
        stage.getIcons().add(anotherIcon);
		
		
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();

		stage.setX(bounds.getMinX());
		stage.setY(bounds.getMinY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());
		
		
		stage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

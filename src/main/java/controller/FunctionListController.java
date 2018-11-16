package controller;

import applicationui.MainScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FunctionListController {
	
	
	@FXML
	Button button;
	
	@FXML
	public void setUI(ActionEvent event)
	{
		
		button = (Button) event.getSource();
		
		if(button.getText().equals("Wealth"))
		{
			//MainScreen.mainRoot.setCenter(MainScreen.wealth.wealthUI());
			System.out.println("Wealth");
		}
		
		if(button.getText().equals("Health"))
		{
			//MainScreen.mainRoot.setCenter(MainScreen.health.healthUI());
			System.out.println("Health");
		}
		
		if(button.getText().equals("Report"))
		{
			System.out.println("Report");
		}
		
		
		
	}

}

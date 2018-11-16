package applicationui;

import utility.ConnectDB;

public class Application {

	
	public static void closeAllConnection()
	{
		ConnectDB.disconnectConnection();
	}
}

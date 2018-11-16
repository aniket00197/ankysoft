package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDB {
	
	static Connection conn;
	protected static Statement stmt;
	
	
	public static void connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Excellence","APPLICATION","APPLICATION");
		  stmt = conn.createStatement();
		  System.out.println("Connection successfully");  
	
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			System.err.println(ex.getMessage());
			}
		catch (SQLException ex)           {
			ex.printStackTrace();
			System.err.println(ex.getMessage());
			}
	
	}
	
	public static void disconnectConnection() 
	{
		try {
			conn.close();
			System.out.println("Database connection closed successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

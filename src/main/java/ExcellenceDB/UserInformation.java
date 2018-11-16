package ExcellenceDB;

import java.sql.ResultSet;
import java.sql.SQLException;

import utility.ConnectDB;

public class UserInformation extends ConnectDB 
{
	ResultSet rs;
	
	public void createUser(String username, String password, String firstname, String lastname,String emailid,String phonenumber)
	{
		String sql = "INSERT INTO USERINFO VALUES(userid.NEXTVAL,'"+username+"','"+password+"',"
				+ "'"+firstname+"','"+lastname+"','"+emailid+"','"+phonenumber+"',1,current_date,current_date)";
		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("User not created please check below issue");
			e.printStackTrace();
		}
	}

	public boolean isValidUser(String username,String password)
	{
		boolean validUser=false;
		String sql = "select username,password from USERINFO WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'";
		try {
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				validUser=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return validUser;
		
		
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection getDBConnection() {
		Connection con=null;
		String username="root";
		String password="root";
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydatabase";
		
		try 
		{
			Class.forName(driver);
			try 
			{
				con=DriverManager.getConnection(url, username, password);
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}

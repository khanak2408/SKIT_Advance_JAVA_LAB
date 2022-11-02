import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql="Select *from userinfo";
		con=DBConnection.getDataBaseConnection();
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
	System.out.println("First name:"+rs.getString(1)+"Last name:"+rs.getString(2));
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

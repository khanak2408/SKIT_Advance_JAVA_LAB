import java.sql.*;
public class DBConnection
{
    public static Connection getDataBaseConnection(){
        Connection con=null;
        String username="root";
        String password="root";
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mydatabase";

        //Step 1: Load and Register the Driver class.
        try
        {
            Class.forName(driver);
            try
            {
                con=DriverManager.getConnection(url,username,password);
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
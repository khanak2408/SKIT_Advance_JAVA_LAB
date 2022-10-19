import java.sql.*;
public class DBConnection{
    public static Connection getDatabaseConnection(){
        String username="root";
        String password="root";
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mydatabase";
        Connection con=null;
        try
        {
            //Step 1: Load and Register Driver class
            Class.forName(driver);
            try
            {
                con=DriverManager.getConnection(url,username,password);
            }
            catch(SQLException e)
            {

            }
        }
        catch(ClassNotFoundException e)
        {

        }
        return con;
    }
}
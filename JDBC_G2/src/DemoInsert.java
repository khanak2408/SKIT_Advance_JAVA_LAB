import java.sql.*;
public class DemoInsert{
    public static void main(String args[]){
        Connection con=null;
        Statement stmt=null;
        String fn="Kohli";
        String ln="Yadav";
        String sqlQuery="Insert into userinfo values('"+fn+"','"+ln+"')";
        con=DBConnection.getDataBaseConnection();
        try
        {
            stmt=con.createStatement();
            int rowInserted=stmt.executeUpdate(sqlQuery);
            if(rowInserted>0)
            {
                System.out.println("Ho gaya record insert");
            }
            else
            {
                System.out.println("Ni Hua");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
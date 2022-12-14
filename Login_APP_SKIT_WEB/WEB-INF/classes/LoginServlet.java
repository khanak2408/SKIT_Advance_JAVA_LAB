import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String un=req.getParameter("un");
        String pwd=req.getParameter("pwd");
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        con=DBConnection.getDBConnection();
        try{
            stmt=con.createStatement();
            String sql="select email,password from tblUserInfo where email='"+un+"' and password='"+pwd+"'";
            rs=stmt.executeQuery(sql);
            if(rs.next()){
                res.sendRedirect("welcome.html");
            }
            else{
                res.sendRedirect("failure.html");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
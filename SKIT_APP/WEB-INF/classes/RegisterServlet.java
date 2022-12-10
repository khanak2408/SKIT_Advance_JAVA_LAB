import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
       String email=req.getParameter("email");
       String psw=req.getParameter("psw");
       String psw_repeat=req.getParameter("psw-repeat");

       Connection con=null;
       Statement stmt=null;
       String sql="Insert into tblUserInfo values('"+email+"','"+psw+"','"+psw_repeat+"')";
       con=DBConnection.getDBConnection();
       try{
            stmt=con.createStatement();
            int r=stmt.executeUpdate(sql);
            if(r>0){
                res.sendRedirect("welcome.html");
            }
            else
            {
                res.sendRedirect("failure.html");
            }
       }
       catch(SQLException e){
        
       }
    }
}